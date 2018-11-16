package com.dcm.more_ds.service.mysql;

import com.dcm.more_ds.constant.base.BaseServiceImpl;
import com.dcm.more_ds.dao.mysql.DicBaseDao;
import com.dcm.more_ds.entity.mysql.DicBase;
import com.dcm.more_ds.query.mysql.DicBaseExample;
import com.dcm.more_ds.vo.DicBaseVO;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;

import java.util.*;


@Service
public class DicBaseServiceImpl extends BaseServiceImpl<DicBase,DicBaseExample,Long> implements DicBaseService {

	@Autowired
	private DicBaseDao dicBaseDao;

	@Override
	public void setDao() {
		this.baseDao = dicBaseDao;
	}

	@Override
	public List<DicBaseVO> getValueByKey(String key, int floor) {

		List<DicBaseVO> returnList ;

		DicBaseExample example = new DicBaseExample();
		example.setOrderByClause(" level ");
		example.createCriteria().andDickeyBinaryEqualTo(key).andEnableEqualTo(1);
		List<DicBase> dicBaseList = this.dicBaseDao.selectByExample(example);

		if(CollectionUtils.isEmpty(dicBaseList)) {
			throw new RuntimeException("字典项 key:[" + key + "]不存在或已被禁用！");
		} else if (dicBaseList.size() > 1) {
			throw new RuntimeException("字典项 key:[" + key + "]重复！, 找到[" + dicBaseList.size() + "]条");
		} else {
			DicBase dicBase = dicBaseList.get(0);
			example = new DicBaseExample();
			example.createCriteria().andCodeLike(dicBase.getCode() + ".%")
					.andLevelLessThanOrEqualTo(dicBase.getLevel() + floor).andEnableEqualTo(1);
			dicBaseList = this.dicBaseDao.selectByExample(example);
			// 组装层级关系
			returnList = buildRelation(convertVo(dicBase), convertVoList(dicBaseList));
		}

		return  returnList;
	}

	private DicBaseVO convertVo(DicBase obj){
		DicBaseVO vo = new DicBaseVO();
		vo.setId(obj.getId());
		vo.setCode(obj.getCode());
		vo.setDiccode(obj.getDiccode());
		vo.setDickey(obj.getDickey());
		vo.setLevel(obj.getLevel());
		vo.setName(obj.getName());
		vo.setPinyin(obj.getPinyin());
		return vo;
	}

	private List<DicBaseVO> convertVoList(List<DicBase> objList){
		List<DicBaseVO> voList = Lists.newArrayList();
		for (DicBase obj : objList) {
			DicBaseVO vo = new DicBaseVO();
			vo.setId(obj.getId());
			vo.setCode(obj.getCode());
			vo.setDiccode(obj.getDiccode());
			vo.setDickey(obj.getDickey());
			vo.setLevel(obj.getLevel());
			vo.setName(obj.getName());
			vo.setPinyin(obj.getPinyin());
			voList.add(vo);
		}
		return voList;
	}

	private List<DicBaseVO> buildRelation(DicBaseVO dicBase, List<DicBaseVO> children) {

		// 同级别按照code排序
		Collections.sort(children, new Comparator<DicBaseVO>() {
			@Override
			public int compare(DicBaseVO o1, DicBaseVO o2) {
				return o1.getCode().compareTo(o2.getCode());
			}
		});

		// 转换
		List<DicBaseVO> result = new ArrayList<>();
		Map<String, DicBaseVO> map = new HashMap<>();

		for (DicBaseVO child : children) {
			String pcode = "";
			if(child.getLevel() > (dicBase.getLevel() + 1)) {
				pcode = child.getCode().substring(0,child.getCode().lastIndexOf('.'));
			}
			DicBaseVO pDicBase = map.get(pcode);
			if(pDicBase == null) { // 是当前结果集中最高级目录
				result.add(child);
			} else {
				pDicBase.getChildren().add(child);
			}
			map.put(child.getCode(), child);
		}
		return result;
	}
}