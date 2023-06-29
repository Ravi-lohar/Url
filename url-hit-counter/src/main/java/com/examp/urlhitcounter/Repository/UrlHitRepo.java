package com.examp.urlhitcounter.Repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
@Repository
public class UrlHitRepo {
    @Autowired
    private HashMap<String , Integer> hm ;


    public HashMap<String, Integer> gethashmap() {
        return hm ;
    }


}
