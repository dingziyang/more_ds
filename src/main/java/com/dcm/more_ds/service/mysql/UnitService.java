package com.dcm.more_ds.service.mysql;



import com.dcm.more_ds.constant.base.BaseService;
import com.dcm.more_ds.entity.mysql.Unit;
import com.dcm.more_ds.query.mysql.UnitExample;

import java.util.List;

public interface UnitService extends BaseService<Unit,UnitExample,Long> {

    /**
     * @author dcm
     * @date 2018-6-26 9:47
     * @Description: 获取所有单位
     * @throws
     */
    List<Unit> getAll();

    /**
      * @author dcm
      * @date 2018-7-2 13:59
      * @Description: 获取根单位以及整个单位树
      * @throws
      */
    Unit getRootTree();

    /**
      * @author dcm
      * @date 2018-8-9 9:22
      * @Description: 获取所有子集
      * @param: unit
      * @throws
      */
    List<Unit> getChildren(Unit unit);

    /**
     * @author dcm
     * @date 2018-6-27 14:31
     * @param: ids
     * @return int
     */
    int deleteByIds(List<Long> ids);
}