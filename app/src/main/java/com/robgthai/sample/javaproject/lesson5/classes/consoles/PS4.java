package com.robgthai.sample.javaproject.lesson5.classes.consoles;

import com.robgthai.sample.javaproject.lesson5.classes.PS4Game;

import java.util.List;

public class PS4 extends PS4Alpha {

    public String playMultipleGames(List<? extends PS4Game> games) {
        String result = "";
        for(PS4Game game: games) {
            result += game + ", ";
        }
        return result;
    }
}
