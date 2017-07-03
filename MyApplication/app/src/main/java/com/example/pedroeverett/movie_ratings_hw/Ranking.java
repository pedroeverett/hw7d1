package com.example.pedroeverett.movie_ratings_hw;


///**
//* Created by pedroeverett on 03/07/2017.
// **/

import java.util.Arrays;

public class Ranking {
    private Movie[] list;

    public Ranking() {
        this.list = new Movie[10];
        setUp();

    }

    public void setUp() {
        Movie movie1 = new Movie("Titanic", "Drama", 1);
        Movie movie2 = new Movie("Doom", "Action", 2);
        Movie movie3 = new Movie("Cops", "Action", 3);
        Movie movie4 = new Movie("Red", "Drama", 4);
        Movie movie5 = new Movie("King Kong", "Drama", 5);
        Movie movie6 = new Movie("Lord of the rings", "Drama", 6);
        Movie movie7 = new Movie("Kat", "Comedi", 7);
        Movie movie8 = new Movie("Lol", "Drama", 8);
        Movie movie9 = new Movie("Coders", "Drama", 9);
        Movie movie10 = new Movie("Panic", "Horror", 10);
        Movie[] moviesArray = {movie1, movie2, movie3, movie4, movie5, movie6, movie7, movie8, movie9, movie10};
        for (Movie movie : moviesArray) {
            this.addM(movie);
        }
    }

    public int listSize() {
        int count = 0;
        for (Movie movie : list) {
            if (movie != null) {
                count++;
            }
        }
        return count;
    }

    public void addM(Movie movie) {
        list[movie.getRanking() - 1] = movie;
    }


    public String getMovie(int index) {
        return list[index - 1].getTitle();

    }

    public void setMovie(String title, String genre, int currentRanking) {
        list[currentRanking - 1] = new Movie(title, genre, currentRanking);
    }

    public String getMovieByID(){
        for (Movie movie : list){
            if (movie.getTitle() == "Red");
            return movie.getTitle();
        }
        return null;
    }

}