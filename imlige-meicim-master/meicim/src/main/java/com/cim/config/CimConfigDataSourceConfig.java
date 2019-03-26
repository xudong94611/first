package com.cim.config;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import javax.sql.DataSource;

@Configuration
@MapperScan(basePackages = "com.cim.cimConfig.dao", sqlSessionFactoryRef = "cimConfigSqlSessionFactory")
public class CimConfigDataSourceConfig {

    @Bean(name = "cimConfigDataSource")
    @ConfigurationProperties(prefix = "spring.datasource.cimconfig")
    public DataSource cimConfigDataSource() {
        return DataSourceBuilder.create().build();
    }

    @Bean(name = "cimConfigSqlSessionFactory")
    public SqlSessionFactory cimConfigSqlSessionFactory(@Qualifier("cimConfigDataSource") DataSource dataSource) throws Exception {
        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
        sqlSessionFactoryBean.setDataSource(dataSource);
        sqlSessionFactoryBean.setMapperLocations(new PathMatchingResourcePatternResolver().getResources("classpath:mapper/cimConfig/*Mapper.xml"));
        return sqlSessionFactoryBean.getObject();
    }

    @Bean(name = "cimConfigTransactionManager")
    public DataSourceTransactionManager cimConfigTransactionManager(@Qualifier("cimConfigDataSource") DataSource dataSource) {
        return new DataSourceTransactionManager(dataSource);
    }

    @Bean(name = "cimConfigSqlSessionTemplate")
    public SqlSessionTemplate testSqlSessionTemplate(@Qualifier("cimConfigSqlSessionFactory") SqlSessionFactory sqlSessionFactory) throws Exception {
        return new SqlSessionTemplate(sqlSessionFactory);
    }
}
