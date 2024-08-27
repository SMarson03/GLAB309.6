package com.Autowire.GLAB3096.myService;

import org.springframework.stereotype.Component;

@Component
public class DatabaseFortuneService implements FortuneServices {
    @Override
    public String getFortune() {
        // TODO Auto-generated method stub
        return "Database connection";
    }
}
