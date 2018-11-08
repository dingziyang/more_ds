package com.dcm.more_ds;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

/**
  * @author xusanduo
  * @date 2018/11/6 14:04
  * @Description: 多数据源
  * @return
  * @throws
  */
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class) // 禁用springBoot自动配置的数据源，这样才能自定义数据源
@ComponentScan("com.dcm.*.**.**")
public class MoreDsApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {

        SpringApplication.run(MoreDsApplication.class, args);
        System.out.println("[---------------more_ds项目: started......]");

    }

    /** 创建一个SpringApplicationBuilder交付给springboot框架来完成初始化运行配置 */
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(MoreDsApplication.class);
    }
}
