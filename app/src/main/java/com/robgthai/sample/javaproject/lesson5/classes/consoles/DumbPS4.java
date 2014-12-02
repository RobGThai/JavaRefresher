package com.robgthai.sample.javaproject.lesson5.classes.consoles;

import com.robgthai.sample.javaproject.lesson5.classes.games.FIFA;
import com.robgthai.sample.javaproject.lesson5.classes.games.PES;

public class DumbPS4 {

    public String playGame(FIFA FIFAGame) {
        return "Playing: " + FIFAGame.toString();
    }

    public String playGame(PES pesGame) {
        return "Playing: " + pesGame.toString();
    }
}
