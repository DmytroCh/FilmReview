package com.example.user.filmreview;

import java.util.ArrayList;

/**
 * Created by User on 15.04.2018.
 */

public class Config {

    public static ArrayList<Film> list = new ArrayList<>();
    public static void addDatas(){
        // dodajemy do listy filmy
        Config.list.add(new Film("Skazani na shawshank" , "Dramat", "skazani_na_shawshank_logo"));
        Config.list.add(new Film("Nietykalni" , "Komedia", "nietykalni_logo"));
        Config.list.add(new Film("Zielona mila" , "Dramat", "zielona_mila_logo"));
        Config.list.add(new Film("Ojciec chrzestny" , "Gangsterski", "ojciec_chrzestny_logo"));
        Config.list.add(new Film("Dwunastu gniewnych ludzi" , "Dramat sądowy", "dwunastu_gniewnych_ludzi_logo"));
        Config.list.add(new Film("Forrest Gump" , "Dramat, Komedia", "forrest_gump_logo"));
        Config.list.add(new Film("Lot nad kukułczym gniazdem" , "Psychologiczny", "lot_nad_kukulczym_gniazdem_logo"));
        Config.list.add(new Film("Ojciec chrzestny 2" , "Gangsterski", "ojciec_chrzestny2_logo"));
        Config.list.add(new Film("Władca Pierścieni: Powrót króla" , "Fantasy", "wladca_pierscieni_powrot_krola_logo"));
        Config.list.add(new Film("Lista Schindlera" , "Wojenny", "lista_schindlera_logo"));
    }
}
