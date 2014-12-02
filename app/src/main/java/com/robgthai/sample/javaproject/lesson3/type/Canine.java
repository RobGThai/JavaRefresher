package com.robgthai.sample.javaproject.lesson3.type;

public abstract class Canine {

    public abstract String bark();
    protected abstract int runningDistance();

    public String run() {
        return String.format("I can run %d KmpH", runningDistance()) ;
    }
}
