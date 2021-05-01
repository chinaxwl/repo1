package com.xwl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnProperty(value = "my.hello.name")
@EnableConfigurationProperties(HelloProperties.class)
public class HelloAutoConfitguration {
    @Autowired
    HelloProperties helloProperties;

    @Bean
    public IndexController indexController() {
        return new IndexController(helloProperties);
    }
}
