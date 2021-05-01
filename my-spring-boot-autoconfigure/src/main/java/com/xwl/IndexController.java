package com.xwl;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {
    HelloProperties helloProperties;

    public IndexController(HelloProperties helloProperties) {
        this.helloProperties=helloProperties;
    }

    @RequestMapping("/")
    public String index(){
        return helloProperties.getName()+"欢迎您";
    }
}
