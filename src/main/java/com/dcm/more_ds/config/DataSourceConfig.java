package com.dcm.more_ds.config;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.support.http.StatViewServlet;
import com.alibaba.druid.support.http.WebStatFilter;
import com.dcm.more_ds.constant.DataSourceType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.annotation.Order;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;

import javax.sql.DataSource;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

/**
  * @author xusanduo
  * @date 2018/11/6 14:58
  * @Description: dataSource参数配置类
  * @return
  * @throws
  */

@Configuration
public class DataSourceConfig {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	// -----------------------------------------mysql config-------------------------------------

	@Value("${datasource.mysql.url}")
	private String dbUrl;

	@Value("${datasource.mysql.username}")
	private String username;

	@Value("${datasource.mysql.password}")
	private String password;

	@Value("${datasource.mysql.driverClassName}")
	private String driverClassName;

	@Value("${datasource.mysql.validationQuery}")
	private String validationQuery;

	@Bean(name="dataSourceMysql")
	public DataSource dataSourceMysql(){
		System.out.println("----------------主配" + dbUrl);

		DruidDataSource datasource = new DruidDataSource();
		datasource.setUrl(dbUrl);
		datasource.setUsername(username);
		datasource.setPassword(password);
		datasource.setDriverClassName(driverClassName);
		datasource.setValidationQuery(validationQuery);
		setDruidOptions(datasource); // 设置druid数据源的属性

		return datasource;
	}

	// -----------------------------------------oracle config-------------------------------------

	@Value("${datasource.oracle.url}")
	private String oracleUrl;

	@Value("${datasource.oracle.username}")
	private String oracleUsername;

	@Value("${datasource.oracle.password}")
	private String oraclePassword;

	@Value("${datasource.oracle.driverClassName}")
	private String oracleDriverClassName;

	@Value("${datasource.oracle.validationQuery}")
	private String oracleValidationQuery;
 
	@Bean(name="dataSourceOracle")
	public DataSource dataSourceOracle(){
		System.out.println("----------------次配" + oracleUrl);

		DruidDataSource datasource = new DruidDataSource();
		datasource.setUrl(oracleUrl);
		datasource.setUsername(oracleUsername);
		datasource.setPassword(oraclePassword);
		datasource.setDriverClassName(oracleDriverClassName);
		datasource.setValidationQuery(oracleValidationQuery);
		setDruidOptions(datasource); // 设置druid数据源的属性

		return datasource;
	}

	// -----------------------------------------druid config-------------------------------------

	@Value("${datasource.druid.initialSize}")
	private int initialSize;

	@Value("${datasource.druid.minIdle}")
	private int minIdle;

	@Value("${datasource.druid.maxActive}")
	private int maxActive;

	@Value("${datasource.druid.maxWait}")
	private int maxWait;

	@Value("${datasource.druid.timeBetweenEvictionRunsMillis}")
	private int timeBetweenEvictionRunsMillis;

	@Value("${datasource.druid.minEvictableIdleTimeMillis}")
	private int minEvictableIdleTimeMillis;

	@Value("${datasource.druid.testWhileIdle}")
	private boolean testWhileIdle;

	@Value("${datasource.druid.testOnBorrow}")
	private boolean testOnBorrow;

	@Value("${datasource.druid.testOnReturn}")
	private boolean testOnReturn;

	@Value("${datasource.druid.poolPreparedStatements}")
	private boolean poolPreparedStatements;

	@Value("${datasource.druid.maxPoolPreparedStatementPerConnectionSize}")
	private int maxPoolPreparedStatementPerConnectionSize;

	@Value("${datasource.druid.filters}")
	private String filters;

	@Value("{datasource.druid.connectionProperties}")
	private String connectionProperties;

	private void setDruidOptions(DruidDataSource datasource){
		datasource.setInitialSize(initialSize);
		datasource.setMinIdle(minIdle);
		datasource.setMaxActive(maxActive);
		datasource.setMaxWait(maxWait);
		datasource.setTimeBetweenEvictionRunsMillis(timeBetweenEvictionRunsMillis);
		datasource.setMinEvictableIdleTimeMillis(minEvictableIdleTimeMillis);
		datasource.setTestWhileIdle(testWhileIdle);
		datasource.setTestOnBorrow(testOnBorrow);
		datasource.setTestOnReturn(testOnReturn);
		datasource.setPoolPreparedStatements(poolPreparedStatements);
		datasource.setMaxPoolPreparedStatementPerConnectionSize(maxPoolPreparedStatementPerConnectionSize);
		try {
			datasource.setFilters(filters);
		} catch (SQLException e) {
			logger.error("druid configuration initialization filter Exception", e);
		}
		datasource.setConnectionProperties(connectionProperties);
	}


	@Bean(name = "dynamicDataSource")
	@Primary  // 优先使用，多数据源
	public DataSource dataSource(){

		DynamicDataSource dynamicDataSource = new DynamicDataSource();
		DataSource mysql = dataSourceMysql();
		DataSource oracle = dataSourceOracle();

		//设置默认数据源
		dynamicDataSource.setDefaultTargetDataSource(mysql);

		//配置多个数据源
		Map<Object,Object> map = new HashMap<>();
		map.put(DataSourceType.Mysql.getName(),mysql);
		map.put(DataSourceType.Oracle.getName(),oracle);
		dynamicDataSource.setTargetDataSources(map);

		return dynamicDataSource;
	}

	@Bean // 事务管理
	public PlatformTransactionManager txManager() {
		return new DataSourceTransactionManager(dataSource());
	}


	@Bean(name="druidServlet")
	public ServletRegistrationBean druidServlet() {
		ServletRegistrationBean reg = new ServletRegistrationBean();
		reg.setServlet(new StatViewServlet());
		reg.addUrlMappings("/druid/*");
		reg.addInitParameter("allow", ""); // 白名单
		return reg;
	}
 
	@Bean(name = "filterRegistrationBean")
	public FilterRegistrationBean filterRegistrationBean() {
		FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean();
		filterRegistrationBean.setFilter(new WebStatFilter());
		filterRegistrationBean.addUrlPatterns("/*");
		filterRegistrationBean.addInitParameter("exclusions", "*.js,*.gif,*.jpg,*.png,*.css,*.ico,/druid/*");
		filterRegistrationBean.addInitParameter("profileEnable", "true");
		filterRegistrationBean.addInitParameter("principalCookieName","USER_COOKIE");
		filterRegistrationBean.addInitParameter("principalSessionName","USER_SESSION");
		filterRegistrationBean.addInitParameter("DruidWebStatFilter","/*");
		return filterRegistrationBean;
	}
}