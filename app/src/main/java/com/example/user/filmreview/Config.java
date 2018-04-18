package com.example.user.filmreview;

import java.util.ArrayList;

/**
 * Created by User on 15.04.2018.
 */

public class Config {

    public static ArrayList<Film> LIST = new ArrayList<>();
    public static int FRAGMENTSCOUNT = 2;
    public static void addDatas(){
        // dodajemy do listy filmy
        Config.LIST.add(new Film("Skazani na shawshank" , "Dramat", "skazani_na_shawshank"));
        Config.LIST.add(new Film("Nietykalni" , "Komedia", "nietykalni"));
        Config.LIST.add(new Film("Zielona mila" , "Dramat", "zielona_mila"));
        Config.LIST.add(new Film("Ojciec chrzestny" , "Gangsterski", "ojciec_chrzestny"));
        Config.LIST.add(new Film("Dwunastu gniewnych ludzi" , "Dramat sądowy", "dwunastu_gniewnych_ludzi"));
        Config.LIST.add(new Film("Forrest Gump" , "Dramat, Komedia", "forrest_gump"));
        Config.LIST.add(new Film("Lot nad kukułczym gniazdem" , "Psychologiczny", "lot_nad_kukulczym_gniazdem"));
        Config.LIST.add(new Film("Ojciec chrzestny 2" , "Gangsterski", "ojciec_chrzestny2"));
        Config.LIST.add(new Film("Władca Pierścieni: Powrót króla" , "Fantasy", "wladca_pierscieni_powrot_krola"));
        Config.LIST.add(new Film("Lista Schindlera" , "Wojenny", "lista_schindlera"));
    }
}
