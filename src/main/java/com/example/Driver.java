package com.example;

public class Driver {

    public static void main(String[] args) {

        Counter counter = new Counter();

        counter.increment();
        counter.increment();

        System.out.println("Count: " + counter.getCount());

        Shouter shouter = new Shouter();
        shouter.shout("hello world");
    }
}