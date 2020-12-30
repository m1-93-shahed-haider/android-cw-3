package com.example.day5;

import java.io.Serializable;

public class Movie implements Serializable {


    private String Name;
    private Double Rating;
    private Double Duration;
    private String Genres;
    private Boolean BasedOnBook;
    private int img;

    public Movie(String name, Double rating, Double duration, String genres, Boolean basedOnBook, int img) {
        Name = name;
        Rating = rating;
        Duration = duration;
        Genres = genres;
        BasedOnBook = basedOnBook;
        this.img = img;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public Double getRating() {
        return Rating;
    }

    public void setRating(Double rating) {
        Rating = rating;
    }

    public Double getDuration() {
        return Duration;
    }

    public void setDuration(Double duration) {
        Duration = duration;
    }

    public String getGenres() {
        return Genres;
    }

    public void setGenres(String genres) {
        Genres = genres;
    }

    public Boolean getBasedOnBook() {
        return BasedOnBook;
    }

    public void setBasedOnBook(Boolean basedOnBook) {
        BasedOnBook = basedOnBook;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }
}
