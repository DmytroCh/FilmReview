package com.example.user.filmreview;

/**
 * Created by User on 15.04.2018.
 */

public class Film {

    private String title;
    private String category;
    private String imageName;

    public Film(String title, String category, String imageName){
        this.title = title;
        this.category = category;
        this.imageName = imageName;
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
}
