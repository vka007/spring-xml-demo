package com.stackroute.domain;

public class Movie {

    Actor actor, actress;

    public Movie(){}

    public Movie(Actor actor, Actor actress) {
        this.actor = actor;
        this.actress = actress;
    }
/*
    String author;

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }
*/

    public void setActor(Actor actor) {
        this.actor = actor;
    }

    public void setActress(Actor actress) {
        this.actress = actress;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "actor=" + actor +
                ", actress=" + actress +
                '}';
    }
}
