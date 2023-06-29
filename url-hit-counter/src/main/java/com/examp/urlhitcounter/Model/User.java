package com.examp.urlhitcounter.Model;

import org.springframework.stereotype.Component;

@Component
public class User {

    private String userName ;

    private Integer hitCount = 0 ;


    public User(String userName, Integer hitCount) {
        this.userName = userName;
        this.hitCount = hitCount;
    }
}
