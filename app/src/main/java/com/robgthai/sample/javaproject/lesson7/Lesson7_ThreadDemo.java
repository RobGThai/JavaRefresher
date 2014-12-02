package com.robgthai.sample.javaproject.lesson7;

import android.os.AsyncTask;

import com.robgthai.sample.javaproject.BaseLesson;
import com.robgthai.sample.javaproject.lesson7.classes.MyRunnable;
import com.robgthai.sample.javaproject.lesson7.classes.MyThread;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicInteger;

public class Lesson7_ThreadDemo extends BaseLesson {

    public static void main(String[] args) throws Exception {

    }

    private static void demo1_thread() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                pl("I'm running");
            }
        }, "demo1").start();
    }

    private static void demo2_class() {
        Thread t = new MyThread(5);
        t.start();
    }

    private static void demo3_runnable() {
        MyRunnable runnable = new MyRunnable(10);
        new Thread(runnable, "demo3").start();
    }

    private static void demo4_executor() {
        Executor executor = new Executor() {
            @Override
            public void execute(Runnable command) {
                new Thread(command).start();
            }
        };
        executor.execute(new MyRunnable(3));

        FutureTask<String> future = new FutureTask<String>(
                new Callable<String>() {
                    public String call() {
                        return "I'm done!";
                    }
                });

        executor.execute(future);
    }

    private static void demo5_atomic() {
        AtomicInteger ai = new AtomicInteger(5);
        ai.compareAndSet(5, 3);
        ai.set(10);
        ai.lazySet(6);
    }

    //Research Future vs Thread

    // AsyncTask & IntentService

    class MyAsyncTask extends AsyncTask<Integer, String, Float> {
        @Override
        protected Float doInBackground(Integer... params) {
            for(Integer i: params) {
                onProgressUpdate("Updating");
            }

            return null;
        }

        @Override
        protected void onPreExecute() {
            super.onPreExecute();
        }

        @Override
        protected void onPostExecute(Float aFloat) {
            super.onPostExecute(aFloat);
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);
        }
    }
}
