package com.acmoon.easyjob;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication(exclude = {
        DataSourceAutoConfiguration.class
}) // 排除Spring boot数据源的自动装配（引入数据源jar包springboot自动装配要求必须提供数据源，否则报错 Failed to configure a DataSource）
@EnableDiscoveryClient  // 开启服务注册与发现功能，网关也是一个微服务节点，也需要注册和被发现
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}