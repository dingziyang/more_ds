package com.dcm.more_ds.service.oracle;


import com.dcm.more_ds.config.TargetDataSource;
import com.dcm.more_ds.constant.DataSourceType;
import com.dcm.more_ds.constant.base.BaseService;
import com.dcm.more_ds.entity.oracle.AUser;
import com.dcm.more_ds.query.oracle.AUserExample;

public interface AUserService extends BaseService<AUser,AUserExample,String> {

    /**
      * @author dcm
      * @date 2018-9-10 18:55
      * @Description: 根据用户名查询用户
      * @param: username
      * @return com.dcm.more_ds.entity.oracle.AUser
      * @throws
      */
    AUser getByUsername(String username);
}