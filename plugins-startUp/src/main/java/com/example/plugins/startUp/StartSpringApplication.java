package com.example.plugins.startUp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author ligq
 * @Description:
 * @date 2021/5/29 8:26 上午
 */
//@ComponentScan("com.example.*")   //自动扫描包下的资源
@SpringBootApplication
public class StartSpringApplication  {
    public static void main(String[] args) {
        SpringApplication.run(StartSpringApplication.class, args);
    }
}
