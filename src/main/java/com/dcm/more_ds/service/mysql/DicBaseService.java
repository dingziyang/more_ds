package com.dcm.more_ds.service.mysql;


import com.dcm.more_ds.constant.base.BaseService;
import com.dcm.more_ds.entity.mysql.DicBase;
import com.dcm.more_ds.query.mysql.DicBaseExample;
import com.dcm.more_ds.vo.DicBaseVO;

import java.util.List;
import java.util.Map;

public interface DicBaseService extends BaseService<DicBase,DicBaseExample,Long> {

    /**
     * @author dcm
     * @date 2018-7-17 11:16
     * @Description: 根据key获取value
     * @param: keys
     * @throws
     */
    List<DicBaseVO> getValueByKey(String key, int floor);
}