package com.dev.diego.movierecommendersystem;

import org.springframework.stereotype.Component;

@Component
public class ContentBasedFilter implements Filter{

    public String[] getRecommendations(String movies){

        return new String[]{"test", "test1"};
    }
    
}
