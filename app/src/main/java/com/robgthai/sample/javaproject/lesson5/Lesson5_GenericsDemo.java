package com.robgthai.sample.javaproject.lesson5;

import com.robgthai.sample.javaproject.BaseLesson;
import com.robgthai.sample.javaproject.lesson5.classes.consoles.CommonPS4;
import com.robgthai.sample.javaproject.lesson5.classes.consoles.PS4;
import com.robgthai.sample.javaproject.lesson5.classes.games.Dota;
import com.robgthai.sample.javaproject.lesson5.classes.consoles.DumbPS4;
import com.robgthai.sample.javaproject.lesson5.classes.games.FIFA;
import com.robgthai.sample.javaproject.lesson5.classes.games.FIFAPS4;
import com.robgthai.sample.javaproject.lesson5.classes.games.FootballCombo;
import com.robgthai.sample.javaproject.lesson5.classes.games.HaloXbox;
import com.robgthai.sample.javaproject.lesson5.classes.games.PES;
import com.robgthai.sample.javaproject.lesson5.classes.consoles.PS4Alpha;
import com.robgthai.sample.javaproject.lesson5.classes.games.TwoInOne;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Lesson5_GenericsDemo extends BaseLesson {

    public static void main(String[] args) throws Exception {
        demo2_dumbPS4();
    }

    private static void demo1_generics() {
        beginMethodPl("demo1_generics");
        List list = new ArrayList();
        List<String> stringList = new ArrayList<String>();
        list.add("Hello");
        stringList.add("Hello");

        String s = (String) list.get(0);
        pl("s1: " + s);
        s = stringList.get(0);
        pl("s2: " + s);
    }

    private static void demo2_dumbPS4() {
        beginMethodPl("demo2_dumbPS4");
        DumbPS4 dumbPS4 = new DumbPS4();

        String nowPlaying = dumbPS4.playGame(new FIFA());
        pl(nowPlaying);

        nowPlaying = dumbPS4.playGame(new PES());
        pl(nowPlaying);
    }

    private static void demo3_CommonPS4() {
        beginMethodPl("demo3_CommonPS4");
        CommonPS4 ps4 = new CommonPS4();

        String nowPlaying = ps4.playGame(new FIFA());
        pl(nowPlaying);

        nowPlaying = ps4.playGame(new PES());
        pl(nowPlaying);

        nowPlaying = ps4.playGame(new Dota());
        pl(nowPlaying);

        nowPlaying = ps4.playGame("Excel");
        pl(nowPlaying);
    }

    private static void demo4_PS4() {
        beginMethodPl("demo4_PS4");
        PS4Alpha<FIFA> ps4 = new PS4Alpha<>();

        String nowPlaying = ps4.playGame(new FIFA());
        pl(nowPlaying);

        PS4Alpha<PES> pesPlayer = new PS4Alpha<>();
        nowPlaying = pesPlayer.playGame(new PES());
        pl(nowPlaying);
    }

    private static void demo5_TwoInOne() {
        beginMethodPl("demo5_TwoInOne");
        PS4Alpha<TwoInOne> ps4 = new PS4Alpha<>();

        TwoInOne<FIFA, PES> twoInOne = new TwoInOne<>(new FIFA(), new PES());

        String nowPlaying = ps4.playGame(twoInOne);
        pl(nowPlaying);
    }

    private static void demo6_combo() {
        beginMethodPl("demo6_combo");
        PS4Alpha<FootballCombo> ps4 = new PS4Alpha<>();

        FootballCombo combo = new FootballCombo(new FIFA(), new PES());

        String nowPlaying = ps4.playGame(combo);
        pl(nowPlaying);
    }

    private static void demo7_bound() {
        beginMethodPl("demo7_bound");
        PS4 ps4 = new PS4();

        List list = new ArrayList();
        list.add(new FIFAPS4());
//        list.add(new HaloXbox());

        String nowPlaying = ps4.playMultipleGames(list);
        pl(nowPlaying);

        Map map = new HashMap<>();
    }

    // List, Map, AsyncTask, WeakReference, etc.
}
