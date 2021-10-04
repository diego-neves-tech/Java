package com.dev.diego.movierecommendersystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class RecommenderImplementation {

    private Filter filter;

    @Autowired
    public RecommenderImplementation(@Qualifier("contentBasedFilter") Filter filter){
        super();
        this.filter = filter;
    }

    public String[] recommendMovies(String movie){

        System.out.println("the filter used was: "+ filter);

        return filter.getRecommendations(movie);
    }

    public void setFilter(Filter filter) {
        this.filter = filter;
    }
    
}
