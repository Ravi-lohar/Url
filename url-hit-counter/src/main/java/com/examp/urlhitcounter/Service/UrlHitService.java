package com.examp.urlhitcounter.Service;

import com.examp.urlhitcounter.Model.User;
import com.examp.urlhitcounter.Repository.UrlHitRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.HashMap;
import java.util.Map;

@Service
public class UrlHitService {
    @Autowired
    UrlHitRepo urlHitRepo ;

    public static Integer hitcount = 0 ;


    public Map<String , Integer> gethashmap(){
        return urlHitRepo.gethashmap();
    }
    public Integer getHitCount(String name) {
        Map<String , Integer> originalList = gethashmap();
        Integer temp = originalList.get(name);
        if(temp == null){
            originalList.put(name , 1);
        }
        else {
            originalList.put(name , temp = temp+1);
        }
        hitcount++ ;
        return originalList.get(name);
    }


    public User getCount() {
        return new User("Visitor" ,hitcount);
    }
}
