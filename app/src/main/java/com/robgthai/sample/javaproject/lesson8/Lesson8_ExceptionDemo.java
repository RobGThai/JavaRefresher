package com.robgthai.sample.javaproject.lesson8;

import com.robgthai.sample.javaproject.lesson8.exceptions.DeveloperNotFoundException;
import com.robgthai.sample.javaproject.lesson8.exceptions.MyThrowableClass;

public class Lesson8_ExceptionDemo {

    public static void main(String[] args) {
    }

    private static void demo1_exception() {
        Exception e = new Exception("ERRAR");
        e.printStackTrace();
    }

    private static void demo2_catch() {
        String s = null;
        try {
            s.charAt(99);
        } catch (NullPointerException | IndexOutOfBoundsException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void demo3_throws() throws Exception {
        throw new Exception("Thrown");
    }

    private static void demo4_finally() {
        String s = null;
        try {
            // open DB
            // open Cursor
            s.charAt(99);
            System.out.println("End of try");
        } catch (Exception e) {
            System.out.println("Exception");
            e.printStackTrace();
            System.out.println("End of Exception");
        } finally {
            System.out.println("Finally");
            // if Cursor still open
            // close cursor
        }
    }

    private static void demo5_customException() {
        try {
            throw new DeveloperNotFoundException("NOOOO");
        } catch (DeveloperNotFoundException e) {
            e.printStackTrace();
        }
    }

    private static void demo6_throwable() {
        try {
            throw new MyThrowableClass("NOOOO");
        } catch (MyThrowableClass e) {
            e.printStackTrace();
        }
    }

    private static void demo6_error() {
        Error e = new Error("Critical error");
        throw e;
    }
}
