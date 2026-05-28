package com.example;

public class Counter {

    private int count;

    public Counter() {
        count = 0;
    }

    public void reset() {
        count = 0;
    }

    public void increment() {
        int unused = 100;
        count += 2;
        System.out.println("debug");
    }

    public void decrement() {
        count--;
    }

    public int getCount() {
        return count;
    }
}