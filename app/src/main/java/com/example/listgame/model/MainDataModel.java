package com.example.listgame.model;

import java.util.ArrayList;
import java.util.List;


public class MainDataModel {
    public static List<MainModel> gamesList() {
        MainModel ff = new MainModel("Final Fantasy", 1987);
        MainModel genshin = new MainModel("Genshi Impact", 2020);
        MainModel mobileLegend = new MainModel("Mobile Legend", 2016);
        MainModel aov = new MainModel("Arena Of Valor", 2017);
        MainModel pubg = new MainModel("Player Unknown's Battlegrounds", 2017);
        MainModel fortnite = new MainModel("Fortnite", 2017);
        MainModel valorant = new MainModel("Valorant", 2020);
        MainModel dota = new MainModel("Dota 2", 2013);
        MainModel csgo = new MainModel("Counter-Strike: Global Offensive", 2012);
        MainModel lol = new MainModel("League of Legends", 2013);


        List<MainModel> gamesList = new ArrayList<>();

        gamesList.add(ff);
        gamesList.add(genshin);
        gamesList.add(mobileLegend);
        gamesList.add(aov);
        gamesList.add(pubg);
        gamesList.add(fortnite);
        gamesList.add(valorant);
        gamesList.add(dota);
        gamesList.add(csgo);
        gamesList.add(lol);


        return gamesList;
    }
}

