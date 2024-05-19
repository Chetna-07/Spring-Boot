package com.springGame.learnspringgame.enterprise.buissness;

import com.springGame.learnspringgame.enterprise.data.DataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class BuissnessService {
    @Autowired
    private DataService dataService;

    public BuissnessService(DataService dataService) {
        this.dataService = dataService;
    }

    public int getSumFromdata(){
        List<Integer> data = dataService.getData();
        return data.stream().reduce(Integer::sum).get();
    }

}
