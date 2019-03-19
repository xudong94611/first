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
@MapperScan(basePackages = "com.cim.cim.dao", sqlSessionFactoryRef = "cimSqlSessionFactory")
public class CimDataSourceConfig {

    @Bean(name = "cimDataSource")
    @ConfigurationProperties(prefix = "spring.datasource.cim")
    @Primary
    public DataSource cimDataSource() {
        return DataSourceBuilder.create().build();
    }

    @Bean(name = "cimSqlSessionFactory")
    @Primary
    public SqlSessionFactory cimSqlSessionFactory(@Qualifier("cimDataSource") DataSource dataSource) throws Exception {
        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
        sqlSessionFactoryBean.setDataSource(dataSource);
        sqlSessionFactoryBean.setMapperLocations(new PathMatchingResourcePatternResolver().getResources("classpath:mapper/cim/*Mapper.xml"));
        return sqlSessionFactoryBean.getObject();
    }

    @Bean(name = "cimTransactionManager")
    @Primary
    public DataSourceTransactionManager cimTransactionManager(@Qualifier("cimDataSource") DataSource dataSource) {
        return new DataSourceTransactionManager(dataSource);
    }

    @Bean(name = "cimSqlSessionTemplate")
    @Primary
    public SqlSessionTemplate testSqlSessionTemplate(@Qualifier("cimSqlSessionFactory") SqlSessionFactory sqlSessionFactory) throws Exception {
        return new SqlSessionTemplate(sqlSessionFactory);
    }
}
