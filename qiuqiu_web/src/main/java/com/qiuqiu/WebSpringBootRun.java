package com.qiuqiu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

//指定springboot程序启动时不加载数据源
@SpringBootApplication(exclude= DataSourceAutoConfiguration.class)
public class WebSpringBootRun {

    public static void main(String[] args) {

        SpringApplication.run(WebSpringBootRun.class,args);
    }
}