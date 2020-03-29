package com.outdd.cms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan("com.outdd.cms.pojo2")
public class AwmCmsServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(AwmCmsServerApplication.class, args);
    }

}
