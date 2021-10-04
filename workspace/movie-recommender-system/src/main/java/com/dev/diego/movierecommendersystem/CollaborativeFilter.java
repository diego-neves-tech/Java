package com.dev.diego.movierecommendersystem;

import org.springframework.stereotype.Component;

@Component
public class CollaborativeFilter implements Filter{
    
    @Override
    public String[] getRecommendations(String movies){

        return new String[]{"test2", "test3"};
    }
}
