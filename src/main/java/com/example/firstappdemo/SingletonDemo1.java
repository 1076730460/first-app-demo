package com.example.firstappdemo;

public class SingletonDemo1 {
    private static SingletonDemo1 instance=new SingletonDemo1();
    public SingletonDemo1 getInstance(){
        return instance;
    }
}
