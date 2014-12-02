package com.robgthai.sample.javaproject.lesson5.classes.consoles;

public class PS4Alpha<Game> {
    public String playGame(Game game) {
        return "Playing: " + game.toString();
    }
}
