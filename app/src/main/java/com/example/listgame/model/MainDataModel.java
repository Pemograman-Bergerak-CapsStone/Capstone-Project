package com.example.listgame.model;

import java.util.ArrayList;
import java.util.List;


    public class MainDataModel {
        public static List<MainModel> gamesList() {
            MainModel ff = new MainModel("Final Fantasy", 1987);
            MainModel genshin = new MainModel("Genshin Impact", 2020);
            MainModel mobileLegend = new MainModel("Mobile Legend", 2016);
            MainModel aov = new MainModel("Arena Of Valor", 2017);

            List<MainModel> gamesList = new ArrayList<>();

            gamesList.add(ff);
            gamesList.add(genshin);
            gamesList.add(mobileLegend);
            gamesList.add(aov);

            return gamesList;
        }
    }

