package org.zhijun.online.main.mybatis;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;


/**
 * @Author ZhiJun
 * @Date 2023/2/6 16:48
 * @Version 1.0
 * @Desc Mybatis配置，包括自定义TypeHandler，Mapper扫描，开启事务
 */
@Configuration
@EnableTransactionManagement
@MapperScan(basePackages = "org.zhijun.online.main.mybatis.mapper")
public class MybatisConfig {
}
