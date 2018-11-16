package com.dcm.more_ds.service.sqlserver.impl;

import com.dcm.more_ds.constant.base.BaseSqlserverServiceImpl;
import com.dcm.more_ds.dao.sqlserver.ProsonmanagementInterfaceDao;
import com.dcm.more_ds.entity.sqlserver.ProsonmanagementInterface;
import com.dcm.more_ds.query.sqlserver.ProsonmanagementInterfaceExample;
import com.dcm.more_ds.service.sqlserver.ProsonmanagementInterfaceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ProsonmanagementInterfaceServiceImpl extends BaseSqlserverServiceImpl<ProsonmanagementInterface,ProsonmanagementInterfaceExample,Object> implements ProsonmanagementInterfaceService {

	@Autowired
	private ProsonmanagementInterfaceDao prosonmanagementInterfaceDao;

	@Override
	public void setDao() {
		this.baseDao = prosonmanagementInterfaceDao;
	}

}