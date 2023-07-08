package com.soni.concept.comparableNCompartor;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MovieService {
    
    public static List<Movie> getList(){
        List<Movie> movies = new ArrayList<>();
        movies.add(new Movie(3,"m3"));
        movies.add(new Movie(1,"m1"));
        movies.add(new Movie(2,"m2"));
        movies.add(new Movie(4,"m4"));
        Collections.sort(movies, (m1, m2) ->  {
            if (m1.getRating() < m2.getRating())
                return -1;
            if (m1.getRating() > m2.getRating())
                return 1;
            else
                return 0;
        });

        return movies;
    }

    public static void main(String[] args){
        List<Movie> movies = getList();
        movies.stream().forEach(m -> System.out.println(m));

    }
}
