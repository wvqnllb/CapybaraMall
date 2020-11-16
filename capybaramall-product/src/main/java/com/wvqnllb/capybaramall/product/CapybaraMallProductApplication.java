package com.wvqnllb.capybaramall.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 1 整合Mybatis-plus
 *  1) 导入依赖
 *  2) 配置
 *      1. 配置数据源；
 *          数据库驱动 application.yml
 *      2. 配置mybatis-plus；
 *          使用mapperscan
 *          映射文件位置
 */
@MapperScan("com.wvqnllb.capybaramall.product.dao")
@SpringBootApplication
public class CapybaraMallProductApplication {

    public static void main(String[] args) {
        SpringApplication.run(CapybaraMallProductApplication.class, args);
    }

}
