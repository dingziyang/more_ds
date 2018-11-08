package com.dcm.more_ds.config;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

/**
  * @author xusanduo
  * @date 2018/11/6 14:49
  * @Description: 动态数据源实现类
  * @return
  * @throws
  */
public class DynamicDataSource extends AbstractRoutingDataSource {

    /** 数据源路由，此方法用于产生要选取的数据源逻辑名称 */
    @Override
    protected Object determineCurrentLookupKey() {
        //从共享线程中获取数据源名称
        return JdbcContextHolder.getDataSource();
    }
}