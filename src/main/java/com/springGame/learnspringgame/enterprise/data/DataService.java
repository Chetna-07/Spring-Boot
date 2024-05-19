package com.springGame.learnspringgame.enterprise.data;

import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class DataService {

    public List<Integer> getData(){
        return Arrays.asList(15,25,35,45);
    }
}
