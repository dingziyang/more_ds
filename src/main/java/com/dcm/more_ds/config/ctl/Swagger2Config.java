package com.dcm.more_ds.config.ctl;

import com.fasterxml.classmate.TypeResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @PackageName: com.dcm.more_ds.config.ctl
 * @ClassName: Swagger2Config
 * @Description: swagger2配置(可以按照包路径或者URL路径分组，这里选择按照包路径分组)
 * @Auther: dcm
 * @Date: 2018-5-31 12:30
 */

@Configuration
@EnableSwagger2
public class Swagger2Config {

    @Autowired
    private TypeResolver typeResolver;

    /**
      * @author dcm
      * @date 2018-7-17 15:37
      * @Description: 自定义的公共方法
      * @param: title 标题
      * @param: description 说明
      * @param: teamService 团队支持信息
      * @param: version 版本
      * @return springfox.documentation.service.ApiInfo
      * @throws
      */
    private ApiInfo setApiInfo(String title, String description, String teamService, String version) {
        return new ApiInfoBuilder().title(title).description(description).termsOfServiceUrl(teamService).version(version).build();
    }

    @Bean
    public Docket MysqlRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(setApiInfo("mysql-api文档","mysql模块-api文档","https://blog.csdn.net/xu_san_duo", "1.0"))
                .groupName("mysql模块")
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.dcm.more_ds.controller.mysql"))
                .paths(PathSelectors.any())
                .build();
    }

    @Bean
    public Docket OracleRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(setApiInfo("oracle-api文档","oracle模块-api文档","https://blog.csdn.net/xu_san_duo", "1.0"))
                .groupName("oracle模块")
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.dcm.more_ds.controller.oracle"))
                .paths(PathSelectors.any())
                .build();
    }
}
