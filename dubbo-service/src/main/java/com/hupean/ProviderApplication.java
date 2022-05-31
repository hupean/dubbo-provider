package com.hupean;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * @author hupan
 * @description
 * @date 2022/5/15
 */
@SpringBootApplication
@ImportResource({"classpath:provider.xml"})
@EnableScheduling
public class ProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProviderApplication.class, args);
    }

}
