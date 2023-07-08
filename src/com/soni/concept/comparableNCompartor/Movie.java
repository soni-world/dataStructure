package com.soni.concept.comparableNCompartor;

import java.util.Comparator;

public class Movie {

//    https://www.geeksforgeeks.org/comparable-vs-comparator-in-java/
    private int rating;
    private String name;

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Movie() {
    }

    public Movie(int rating, String name) {
        this.rating = rating;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "rating=" + rating +
                ", name='" + name + '\'' +
                '}';
    }
}

class MyComparator implements Comparator<Movie> {

    @Override
    public int compare(Movie m1, Movie m2) {
        if (m1.getRating() < m2.getRating())
            return -1;
        if (m1.getRating() > m2.getRating())
            return 1;
        else
            return 0;
    }
}
