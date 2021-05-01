package com.xwl;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("my.hello")
public class HelloProperties {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
