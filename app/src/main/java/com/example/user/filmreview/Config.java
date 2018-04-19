package com.example.user.filmreview;

import com.example.user.filmreview.detailActivity.Actor;

import java.util.ArrayList;

/**
 * Created by User on 15.04.2018.
 */

public class Config {

    public static ArrayList<Film> LIST = new ArrayList<>();
    public static int FRAGMENTSCOUNT = 2;
    public static String FILMINSTANTNAME = "Film";
    public static String IMAGETYPE = "drawable";
    public static String SLASHDOWN = "_";


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
        actorsList.add(new Actor("Christian", "Ameri",66,"nietykalni_actor_4"));
        Config.LIST.add(new Film("Nietykalni" , "Komedia", "nietykalni", actorsList));

        actorsList = new ArrayList<>();
        actorsList.add(new Actor("Tom", "Hanks", 61,"zielona_mila_actor_1"));
        actorsList.add(new Actor("David", "Morse", 64,"zielona_mila_actor_2"));
        actorsList.add(new Actor("Bonnie", "Hunt", 56,"zielona_mila_actor_3"));
        actorsList.add(new Actor("James", "Cromwell", 78,"zielona_mila_actor_4"));
        Config.LIST.add(new Film("Zielona mila" , "Dramat", "zielona_mila", actorsList));

        actorsList = new ArrayList<>();
        actorsList.add(new Actor("Marlon", "Brando", 80,"ojciec_chrzestny_actor_1"));
        actorsList.add(new Actor("Al", "Pacino", 77,"ojciec_chrzestny_actor_2"));
        actorsList.add(new Actor("James", "Caan", 78,"ojciec_chrzestny_actor_3"));
        actorsList.add(new Actor("Robert", "Duvall", 87,"ojciec_chrzestny_actor_4"));
        Config.LIST.add(new Film("Ojciec chrzestny" , "Gangsterski", "ojciec_chrzestny", actorsList));

        actorsList = new ArrayList<>();
        actorsList.add(new Actor("Martin", "Balsam", 76,"dwunastu_gniewnych_ludzi_actor_1"));
        actorsList.add(new Actor("John", "Fiedler", 80,"dwunastu_gniewnych_ludzi_actor_2"));
        actorsList.add(new Actor("Jack", "Klugman", 90,"dwunastu_gniewnych_ludzi_actor_3"));
        Config.LIST.add(new Film("Dwunastu gniewnych ludzi" , "Dramat sądowy", "dwunastu_gniewnych_ludzi", actorsList));

        actorsList = new ArrayList<>();
        actorsList.add(new Actor("Tom", "Hanks", 61,"forrest_gump_actor_1"));
        actorsList.add(new Actor("Robin", "Wright", 52,"forrest_gump_actor_2"));
        actorsList.add(new Actor("Gary", "Sinise", 63,"forrest_gump_actor_3"));
        Config.LIST.add(new Film("Forrest Gump" , "Dramat, Komedia", "forrest_gump", actorsList));

        actorsList = new ArrayList<>();
        actorsList.add(new Actor("Jack", "Nicholson", 80,"lot_nad_kukulczym_gniazdem_actor_1"));
        actorsList.add(new Actor("Louise", "Fletcher", 83,"lot_nad_kukulczym_gniazdem_actor_2"));
        actorsList.add(new Actor("Sydney", "Lassick", 80,"lot_nad_kukulczym_gniazdem_actor_3"));
        Config.LIST.add(new Film("Lot nad kukułczym gniazdem" , "Psychologiczny", "lot_nad_kukulczym_gniazdem", actorsList));

        actorsList = new ArrayList<>();
        actorsList.add(new Actor("Al", "Pacino", 77,"ojciec_chrzestny2_actor_1"));
        actorsList.add(new Actor("Robert", "Duvall", 87,"ojciec_chrzestny2_actor_2"));
        actorsList.add(new Actor("Diane", "Keaton", 72,"ojciec_chrzestny2_actor_3"));
        Config.LIST.add(new Film("Ojciec chrzestny 2" , "Gangsterski", "ojciec_chrzestny2", actorsList));


        actorsList = new ArrayList<>();
        actorsList.add(new Actor("Elijah", "Wood", 37,"wladca_pierscieni_powrot_krola_actor_1"));
        actorsList.add(new Actor("Sean", "Astin", 47,"wladca_pierscieni_powrot_krola_actor_2"));
        actorsList.add(new Actor("Dominic", "Monaghan", 41,"wladca_pierscieni_powrot_krola_actor_3"));
        Config.LIST.add(new Film("Władca Pierścieni: Powrót króla" , "Fantasy", "wladca_pierscieni_powrot_krola", actorsList));

        actorsList = new ArrayList<>();
        actorsList.add(new Actor("Liam", "Neeson", 65,"lista_schindlera_actor_1"));
        actorsList.add(new Actor("Ben", "Kingsley", 74,"lista_schindlera_actor_2"));
        actorsList.add(new Actor("Ralph", "Fiennes", 55,"lista_schindlera_actor_3"));
        Config.LIST.add(new Film("Lista Schindlera" , "Wojenny", "lista_schindlera", actorsList));
    }
}
