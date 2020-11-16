package com.wvqnllb.capybaramall.coupon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class CapybaramallCouponApplication {

    public static void main(String[] args) {
        SpringApplication.run(CapybaramallCouponApplication.class, args);
    }

}
