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
@MapperScan(basePackages = "com.cim.manageFile.dao", sqlSessionFactoryRef = "manageFileSqlSessionFactory")
public class ManageFileDataSourceConfig {

    @Bean(name = "manageFileDataSource")
    @ConfigurationProperties(prefix = "spring.datasource.managefile")
    public DataSource manageFileDataSource() {
        return DataSourceBuilder.create().build();
    }

    @Bean(name = "manageFileSqlSessionFactory")
    public SqlSessionFactory manageFileSqlSessionFactory(@Qualifier("manageFileDataSource") DataSource dataSource) throws Exception {
        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
        sqlSessionFactoryBean.setDataSource(dataSource);
        sqlSessionFactoryBean.setMapperLocations(new PathMatchingResourcePatternResolver().getResources("classpath:mapper/manageFile/*Mapper.xml"));
        return sqlSessionFactoryBean.getObject();
    }

    @Bean(name = "manageFileTransactionManager")
    public DataSourceTransactionManager manageFileTransactionManager(@Qualifier("manageFileDataSource") DataSource dataSource) {
        return new DataSourceTransactionManager(dataSource);
    }

    @Bean(name = "manageFileSqlSessionTemplate")
    public SqlSessionTemplate testSqlSessionTemplate(@Qualifier("manageFileSqlSessionFactory") SqlSessionFactory sqlSessionFactory) throws Exception {
        return new SqlSessionTemplate(sqlSessionFactory);
    }
}
