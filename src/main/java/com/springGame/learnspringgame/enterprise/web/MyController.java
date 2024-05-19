package com.springGame.learnspringgame.enterprise.web;

import com.springGame.learnspringgame.enterprise.buissness.BuissnessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MyController {

    private BuissnessService buisnessService;

    @Autowired
    public MyController(BuissnessService buisnessService) {
        this.buisnessService = buisnessService;
    }

    public int getBuissnesData(){
        return buisnessService.getSumFromdata();
    }

}
