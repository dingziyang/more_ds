package com.dcm.more_ds.config;

/**
 * @ PackageName: com.dcm.more_ds.config
 * @ ClassName: JdbcContextHolder
 * @ Description: 动态数据源持有者，负责利用ThreadLocal存取数据源名称
 * @ Auther: xusanduo
 * @ Date: 2018/11/6 14:11
 */

public class JdbcContextHolder {

    /** 本地线程共享对象（保证在同一线程下切换后不要被其他线程修改） */
    private final static ThreadLocal<String> local = new ThreadLocal<>();

    public static void putDataSource(String name){
        local.set(name);
    }

    public static String getDataSource(){
        return local.get();
    }

    public static void removeDataSource(){
        local.remove();
    }

}
