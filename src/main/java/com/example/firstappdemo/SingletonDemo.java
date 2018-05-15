package com.example.firstappdemo;

public class SingletonDemo {
    private static SingletonDemo instance=new SingletonDemo();
    public static synchronized SingletonDemo getInstance(){
        if(instance==null){
            instance=new SingletonDemo();
        }
        return instance;
    }
}
