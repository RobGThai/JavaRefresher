package com.robgthai.sample.javaproject.lesson2.fizzbuzz;

public class FizzPrinter extends StandardPrinter {

    @Override
    public String print(int number) {
        if(number % 3 == 0) {
            return "Fizz";
        }
        return super.print(number);
    }
}
