package com.pig.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author eklin
 * @create 2020-03-08 10:01
 */
@SpringBootApplication
@EnableDiscoveryClient
public class AlibabaProviderMain9001 {

    public static void main(String[] args) {
        SpringApplication.run(AlibabaProviderMain9001.class, args);
    }
}
