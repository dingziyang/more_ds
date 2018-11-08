package com.dcm.more_ds.dao.oracle;


import com.dcm.more_ds.constant.base.BaseDao;
import com.dcm.more_ds.entity.oracle.AUser;
import com.dcm.more_ds.query.oracle.AUserExample;

public interface AUserDao extends BaseDao<AUser, AUserExample> {

    AUser selectByUsername(String username);
}