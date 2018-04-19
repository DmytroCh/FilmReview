package com.example.user.filmreview;

import com.example.user.filmreview.detailActivity.Actor;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created by User on 15.04.2018.
 */

public class Film implements Serializable{

    private String title;
    private String category;
    private String imageName;
    private ArrayList<Actor> actors;

    public Film(String title, String category, String imageName, ArrayList<Actor> actors){
        this.title = title;
        this.category = category;
        this.imageName = imageName;
        this. actors = actors;
    }

    public String getTitle() {
        return title;
    }

    public String getCategory() {
        return category;
    }

    public String getImageName() {
        return imageName;
    }

    public ArrayList<Actor> getActors() {
        return actors;
    }
}
