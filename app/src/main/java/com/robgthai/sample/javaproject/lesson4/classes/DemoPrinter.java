package com.robgthai.sample.javaproject.lesson4.classes;

import com.robgthai.sample.javaproject.lesson4.interfaces.DemoListener;


public class DemoPrinter implements DemoListener {

    @Override
    public void demoStart() {
        print("Start");
    }

    @Override
    public void runningDemo(String demoName) {
        print("Running " + demoName);
    }

    @Override
    public void demoFinish() {
        print("Finish");
    }

    protected void print(String msg) {
        System.out.println("DemoPrinter: " + msg);
    }
}
