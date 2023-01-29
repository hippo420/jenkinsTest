package com.example.jenkinsTest;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
@Scope( value="request", proxyMode = ScopedProxyMode.TARGET_CLASS)
public class MyLogger {

    private String uuid;
    private String URL;

    public void setURL(String URL) {
        this.URL = URL;
    }

    public String log(String message){
        String msg = uuid+" => ["+URL+"] : "+message;
        System.out.println(uuid+" => ["+URL+"] : "+message);
        return msg;
    }
    @PostConstruct
    public void init(){
        uuid = UUID.randomUUID().toString();
    }
    @PreDestroy
    public void destroy(){
        System.out.println("destroyed....");
    }
}
