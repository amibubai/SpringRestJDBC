package com.example.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
@ComponentScan("com.example")
@PropertySource("classpath:application.properties")
public class AppConfig {
	@Autowired
	Environment environment;
	@Bean
	DataSource dataSource() {
		DriverManagerDataSource datasource=new DriverManagerDataSource();
		datasource.setUrl(environment.getRequiredProperty("${spring.datasource.url}"));
		datasource.setUsername(environment.getRequiredProperty("${spring.datasource.username}"));
		datasource.setPassword(environment.getRequiredProperty("${spring.datasource.password}"));
		return datasource;
	}

}
