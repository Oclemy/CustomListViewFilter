package com.tutorials.hp.lvfilter;

/**
 * Created by Hp on 3/24/2016.
 */
public class Movie {

    private String name;
    private int image;

    public Movie(String name, int image) {
        this.name = name;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public int getImage() {
        return image;
    }
}
