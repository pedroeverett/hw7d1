package com.example.pedroeverett.movie_ratings_hw;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by pedroeverett on 03/07/2017.
 */

public class RankingTest {

    Ranking ranking;
    Movie movie;

    @Before
    public void before() {
        ranking = new Ranking();

    }

//    @Test
//    public void checkArrayEmpty() {
//        assertEquals(0, ranking.listSize());
//    }

    @Test
    public void setUpMovies() {
        ranking.setUp();
        assertEquals(10, ranking.listSize());
    }

    @Test
    public void getMovieAtRanking() {
        assertEquals("Panic", ranking.getMovie(10));
    }

    @Test
    public void checkChangeMovie() {
        ranking.setMovie("Tinoni", "Bio", 10);
        assertEquals("Tinoni", ranking.getMovie(10));
    }

    @Test
    public void checkGetMovieById() {
        assertEquals("Red", ranking.getMovieByID());
    }
}
