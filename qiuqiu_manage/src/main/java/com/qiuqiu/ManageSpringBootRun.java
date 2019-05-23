package com.qiuqiu;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.qiuqiu.mapper") //将Mybatis的mapper接口交给spring容器管理
public class ManageSpringBootRun {

    public static void main(String[] args) {

        SpringApplication.run(ManageSpringBootRun.class,args);
    }
}