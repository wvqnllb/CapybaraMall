package com.wvqnllb.capybaramall.member;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients(basePackages ="com.wvqnllb.capybaramall.member.feign")
@EnableDiscoveryClient
@SpringBootApplication
public class CapybaramallMemberApplication {

    public static void main(String[] args) {
        SpringApplication.run(CapybaramallMemberApplication.class, args);
    }

}
