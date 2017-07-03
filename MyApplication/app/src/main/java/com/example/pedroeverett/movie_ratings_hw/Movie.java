package com.example.pedroeverett.movie_ratings_hw;

/**
 * Created by pedroeverett on 03/07/2017.
 */

public class Movie {
    private String title;
    private String genre;
    private int currentRanking;

    public Movie (String title, String genre, int currentRanking) {
        this.title = title;
        this.genre = genre;
        this.currentRanking = currentRanking;

    }

    public String getTitle() {
        return title;
    }

    public String getGenre() {
        return genre;
    }

    public int getRanking() {
        return currentRanking;
    }

    public String setTitle(String newTitle) {
        return title = newTitle;
    }

    public String setGenre(String newGenre) {
        return genre = newGenre;
    }

    public int setRanking(int newRanking) {
        return currentRanking = newRanking;
    }

    public String toString() {
        return "Title: " + title +", Genre: "+ genre + ", Ranking: " + currentRanking;
    }




}

