package com.examp.urlhitcounter.Controller;

import com.examp.urlhitcounter.Model.User;
import com.examp.urlhitcounter.Service.UrlHitService;
import jakarta.websocket.server.PathParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.integration.IntegrationAutoConfiguration;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping(value = "api/v1/visitor-count-app" )
public class UrlHitController {
    @Autowired
    public UrlHitService urlHitService ;

    @GetMapping("Count")
    public User getcount(){
        return urlHitService.getCount();
    }
    @GetMapping("count/{username}")
    public Integer getHitCount(@PathVariable String username){
        return urlHitService.getHitCount(username);
    }

}
