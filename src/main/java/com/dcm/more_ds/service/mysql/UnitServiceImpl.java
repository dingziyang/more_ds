package com.dcm.more_ds.service.mysql;

import com.dcm.more_ds.constant.base.BaseServiceImpl;
import com.dcm.more_ds.dao.mysql.UnitDao;
import com.dcm.more_ds.entity.mysql.Unit;
import com.dcm.more_ds.query.mysql.UnitExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


@Service
public class UnitServiceImpl extends BaseServiceImpl<Unit,UnitExample,Long> implements UnitService {

	@Autowired
	private UnitDao unitDao;

	@Override
	public void setDao() {
		this.baseDao = unitDao;
	}

	@Override
	public List<Unit> getAll() {

		UnitExample example = new UnitExample();
		example.setOrderByClause(" level ");
		example.createCriteria().andEnableEqualTo(1);
		List<Unit> units = this.selectByExample(example);

		List<Unit> result = new ArrayList<>();
		Map<String, Unit> map = new HashMap<>();
		for (Unit unit : units) {
			String pcode = "";
			if (unit.getLevel() > 1) {
				pcode = unit.getCode().substring(0,unit.getCode().lastIndexOf('.'));
			}
			Unit pUnit = map.get(pcode);

			if( pUnit == null ) { // 是顶级单位
				result.add(unit);
			} else {
				pUnit.getChildren().add(unit);
			}
			map.put(unit.getCode(), unit);
		}
		return result;
	}

	@Override
	@Transactional(rollbackFor = Exception.class)
	public int deleteByIds(List<Long> ids){
		// 删 单位
		UnitExample unitExample = new UnitExample();
		unitExample.createCriteria().andIdIn(ids);
		this.unitDao.deleteByExample(unitExample);

		return ids.size();
	}

	@Override
	public Unit getRootTree() {

		UnitExample example = new UnitExample();
		example.setOrderByClause(" level ");
		List<Unit> units = this.selectByExample(example);

		Unit rootUnit = new Unit();
		List<Unit> result = new ArrayList<>();
		Map<String, Unit> map = new HashMap<>();
		for (Unit unit : units) {
			String pcode = "";
			if (unit.getLevel() > 1) {
				pcode = unit.getCode().substring(0,unit.getCode().lastIndexOf('.'));
			}
			Unit pUnit = map.get(pcode);

			if(pUnit == null) {
				if(unit.getLevel() == 1) { // 是一级单位
					result.add(unit);
				}
				if(unit.getLevel() == 0){ // 是根单位
					rootUnit = unit;
				}
			} else {
				pUnit.getChildren().add(unit);
			}
			map.put(unit.getCode(), unit);
		}
		rootUnit.setChildren(result);
		return rootUnit;
	}

	@Override
	public List<Unit> getChildren(Unit unit) {
		// 查询出所有子集
		UnitExample example = new UnitExample();
		boolean searchNameFlag = false;
		if (unit != null) {
			UnitExample.Criteria c = example.createCriteria();
			if(!StringUtils.isEmpty(unit.getCode())){
				c.andCodeLike(unit.getCode() + ".%");
			}
			if(!StringUtils.isEmpty(unit.getName())){
				c.andNameLike("%" + unit.getName() + "%");
				searchNameFlag = true;
			}
			c.andLevelGreaterThan(unit.getLevel());
		}
		example.setOrderByClause(" level, idx");
		List<Unit> children = this.unitDao.selectByExample(example);

		// 同级别按照code排序
//		Collections.sort(children, new Comparator<Unit>() {
//			@Override
//			public int compare(Unit o1, Unit o2) {
//				if (o1.getLevel() == o2.getLevel()) {
//					return o1.getCode().hashCode() - o2.getCode().hashCode();
//				} else {
//					return 0;
//				}
//			}
//		});

		// 转换
		List<Unit> result = new ArrayList<>();
		Map<String, Unit> map = new HashMap<>();

		for (Unit child : children) {
			String pcode = "";
			if(child.getLevel() > (unit.getLevel() + 1)) {
				pcode = child.getCode().substring(0,child.getCode().lastIndexOf('.'));
			}
			Unit pUnit = map.get(pcode);
			if(pUnit == null) { // 是当前结果集中最高级目录
				result.add(child);
			} else {
				pUnit.getChildren().add(child);
			}
			map.put(child.getCode(), child);
		}

		// 如果有name条件，过滤掉组装后的第一层中不符合level+1的数据
		if(searchNameFlag) {
			result = result.stream().filter( m -> m.getLevel() == unit.getLevel()+1).collect(Collectors.toList());
		}
		return result;
	}

}