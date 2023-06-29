package com.examp.urlhitcounter.Configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.HashMap;

@Component
public class BeanManager {
    @Bean
    HashMap<String, Integer> gethashmaps(){
        return new HashMap<>();
    }
}
