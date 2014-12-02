package com.robgthai.sample.javaproject;

public abstract class BaseLesson {

    protected static void pl(String msg) {
        System.out.println(msg);
    }

    protected static void beginMethodPl(String msg) {
        pl("");
        pl("====[[[ " + msg + " ]]]====");
    }
}
