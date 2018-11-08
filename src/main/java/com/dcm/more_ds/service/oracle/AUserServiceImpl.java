package com.dcm.more_ds.service.oracle;

import com.dcm.more_ds.constant.base.BaseOracleServiceImpl;
import com.dcm.more_ds.dao.oracle.AUserDao;
import com.dcm.more_ds.entity.oracle.AUser;
import com.dcm.more_ds.query.oracle.AUserExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class AUserServiceImpl extends BaseOracleServiceImpl<AUser,AUserExample,String> implements AUserService {

	@Autowired
	private AUserDao aUserDao;

	@Override
	public void setDao() {
		this.baseDao = aUserDao;
	}

	@Override
	public AUser getByUsername(String username) {
		return this.aUserDao.selectByUsername(username);
	}
}