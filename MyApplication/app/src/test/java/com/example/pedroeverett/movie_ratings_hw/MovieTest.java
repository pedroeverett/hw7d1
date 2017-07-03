package com.example.pedroeverett.movie_ratings_hw;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;




/**
 * Created by pedroeverett on 03/07/2017.
 */

public class MovieTest {

    Movie movie;

    @Before
    public void before() {
        movie = new Movie("Titanic", "Drama", 10);
    }

    @Test
    public void getTitle() {
        assertEquals("Titanic", movie.getTitle());
    }

    @Test
    public void getGenre() {
        assertEquals("Drama", movie.getGenre());
    }

    @Test
    public void getRating() {
        assertEquals(10, movie.getRanking());
    }

    @Test
    public void setTitle() {
        assertEquals("Rambo", movie.setTitle("Rambo"));
    }

    @Test
    public void setGenre() {
        assertEquals("Action", movie.setGenre("Action"));
    }

    @Test
    public void setRating() {
        assertEquals(3, movie.setRanking(3));
    }

    @Test
    public void checkToString() {
        assertEquals("Title: Titanic, Genre: Drama, Ranking: 10", movie.toString());
    }


}
