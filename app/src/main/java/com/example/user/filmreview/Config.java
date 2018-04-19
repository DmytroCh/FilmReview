package com.example.user.filmreview;

import com.example.user.filmreview.detailActivity.Actor;

import java.util.ArrayList;

/**
 * Created by User on 15.04.2018.
 */

public class Config {

    public static ArrayList<Film> LIST = new ArrayList<>();
    public static int FRAGMENTSCOUNT = 2;
    public static void addDatas(){

        // dodajemy do listy filmy
        ArrayList<Actor> actorsList = new ArrayList<Actor>();
        actorsList.add(new Actor("Tim", "Robbins", 59,"skazani_na_shawshank_actor_1"));
        actorsList.add(new Actor("Morgan", "Freeman", 80, "skazani_na_shawshank_actor_2"));
        actorsList.add(new Actor("Bob", "Gunton",72,"skazani_na_shawshank_actor_3"));
        actorsList.add(new Actor("William", "Sadler",68,"skazani_na_shawshank_actor_4"));
        Config.LIST.add(new Film("Skazani na shawshank" , "Dramat", "skazani_na_shawshank", actorsList));

        actorsList = new ArrayList<>();
        actorsList. add(new Actor("François", "Cluzet", 62,"nietykalni_actor_1"));
        actorsList.add(new Actor("Omar", "Sy", 40,"nietykalni_actor_2"));
        actorsList.add(new Actor("Audrey", "Fleurot",40,"nietykalni_actor_3"));
        Config.LIST.add(new Film("Nietykalni" , "Komedia", "nietykalni", actorsList));

        actorsList = new ArrayList<>();
        Config.LIST.add(new Film("Zielona mila" , "Dramat", "zielona_mila", actorsList));
        Config.LIST.add(new Film("Ojciec chrzestny" , "Gangsterski", "ojciec_chrzestny", actorsList));
        Config.LIST.add(new Film("Dwunastu gniewnych ludzi" , "Dramat sądowy", "dwunastu_gniewnych_ludzi", actorsList));
        Config.LIST.add(new Film("Forrest Gump" , "Dramat, Komedia", "forrest_gump", actorsList));
        Config.LIST.add(new Film("Lot nad kukułczym gniazdem" , "Psychologiczny", "lot_nad_kukulczym_gniazdem", actorsList));
        Config.LIST.add(new Film("Ojciec chrzestny 2" , "Gangsterski", "ojciec_chrzestny2", actorsList));
        Config.LIST.add(new Film("Władca Pierścieni: Powrót króla" , "Fantasy", "wladca_pierscieni_powrot_krola", actorsList));
        Config.LIST.add(new Film("Lista Schindlera" , "Wojenny", "lista_schindlera", actorsList));
    }
}
