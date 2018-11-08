package com.dcm.more_ds.config;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

/**
 * @ PackageName: com.dcm.more_ds.config
 * @ ClassName: DataSourceAspect
 * @ Description: AOP数据源切换
 * @ Auther: xusanduo
 * @ Date: 2018/11/6 14:14
 */

@Aspect
@Order(2)
@Component
public class DataSourceAspect {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    // 切入点：service类的方法上(这个包的子包及所有包的里面的以Service结尾的类的任意方法名任意参数的方法，都讲被切到)
    @Pointcut("execution(* com.dcm.more_ds..*Service..*(..))")
    public void dataSourcePointCut(){
        System.out.println("dataSourcePointCut service");
    }

    @Before("dataSourcePointCut()")
    private void before(JoinPoint joinPoint){
        Object target = joinPoint.getTarget();
        String method = joinPoint.getSignature().getName();
        Class<?> classz = target.getClass();
        Class<?>[] parameterTypes = ((MethodSignature) joinPoint.getSignature()).getMethod().getParameterTypes();
        try {
            Method m = classz.getMethod(method,parameterTypes);

            // 如果 m 上存在切换数据源的注解，则根据注解内容进行数据源切换
            if (m != null && m.isAnnotationPresent(TargetDataSource.class)){
                TargetDataSource data = m.getAnnotation(TargetDataSource.class);
                JdbcContextHolder.putDataSource(data.value().getName());
                logger.info("》》》》》》》 current thread " + Thread.currentThread().getName() + " add 【 " + data.value().getName() + " 】 to ThreadLocal");
            } else { // 如果不存在，则使用默认数据源
                logger.info("》》》》》》》 use default datasource");
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    // 执行完切面后，将线程共享中的数据源名称清空
    @After("dataSourcePointCut()")
    public void after(JoinPoint joinPoint){
        JdbcContextHolder.removeDataSource();
    }

}
