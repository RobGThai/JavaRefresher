package com.robgthai.sample.javaproject.lesson4.classes;

import com.robgthai.sample.javaproject.lesson4.interfaces.DemoListener;

public class DemoListenerWrapper implements DemoListener {

    private DemoListener listener;

    public DemoListenerWrapper(DemoListener listener) {
        this.listener = listener;
    }

    @Override
    public void demoStart() {
        System.out.println("Starting up .....");
        listener.demoStart();
    }

    @Override
    public void runningDemo(String demoName) {
        listener.runningDemo(demoName);
    }

    @Override
    public void demoFinish() {
        listener.demoFinish();
    }
}
