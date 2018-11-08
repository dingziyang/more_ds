package com.dcm.more_ds.config;

import com.dcm.more_ds.constant.DataSourceType;

import java.lang.annotation.*;

/**
 * @ PackageName: com.dcm.more_ds.config
 * @ ClassName: MyDataSource
 * @ Description: 自定义注解TargetDataSource
 * @ Auther: xusanduo
 * @ Date: 2018/11/6 14:12
 */

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface TargetDataSource {

    DataSourceType value() default DataSourceType.Mysql;
}
