package com.example.user.filmreview.detailActivity;


import java.io.Serializable;

/**
 * Created by User on 19.04.2018.
 */

public class Actor implements Serializable {

    private String name;
    private String surname;
    private int age;
    private String image;


    public Actor(String name, String surname, int age, String image) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public String getImage() {
        return image;
    }
}
