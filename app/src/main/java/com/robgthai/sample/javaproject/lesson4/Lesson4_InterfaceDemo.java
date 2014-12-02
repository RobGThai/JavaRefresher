package com.robgthai.sample.javaproject.lesson4;

import com.robgthai.sample.javaproject.BaseLesson;
import com.robgthai.sample.javaproject.lesson4.classes.DemoListenerWrapper;
import com.robgthai.sample.javaproject.lesson4.classes.DemoPrinter;
import com.robgthai.sample.javaproject.lesson4.classes.InheritInterfacePrinter;
import com.robgthai.sample.javaproject.lesson4.interfaces.DemoListener;

@SuppressWarnings("unused")
public class Lesson4_InterfaceDemo extends BaseLesson {

    static DemoListener listener = new DemoListener() {
        @Override
        public void demoStart() {
            pl("Start demo1");
        }

        @Override
        public void runningDemo(String demoName) {
            pl("Running " + demoName);
        }

        @Override
        public void demoFinish() {
            pl("Finish");
        }
    };

    interface IntMaker {
        public int makeInt();
    }

    public static void main (String[] args) throws Exception {
        demo1_interface();
        demo2_implements();
        demo3_inheritence();
        demo4_wrapper();

        new IntMaker() {
            @Override
            public int makeInt() {
                return 0;
            }
        };
    }

    private static void demo1_interface() {
        beginMethodPl("demo1_interface");
        startDemo(listener, "demo1_interface");
    }

    private static void demo2_implements() {
        beginMethodPl("demo2_implements");
        startDemo(new DemoPrinter(), "demo2_implements");
    }

    private static void demo3_inheritence() {
        beginMethodPl("demo3_inheritence");
        startDemo(new InheritInterfacePrinter(), "demo3_inheritence");
    }

    private static void demo4_wrapper() {
        beginMethodPl("demo4_wrapper");
        startDemo(new DemoListenerWrapper(listener), "demo4_wrapper");
    }

    private static void startDemo(DemoListener listener, String demoName) {
        listener.demoStart();
        listener.runningDemo(demoName);
        listener.demoFinish();
    }

    // Android Listener
}
