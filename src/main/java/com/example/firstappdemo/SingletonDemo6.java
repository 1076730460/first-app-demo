package com.example.firstappdemo;

public class SingletonDemo6 {
   private static class SingletonDemo{
        private  static final SingletonDemo6 instance=new SingletonDemo6();
    }
    public SingletonDemo6 getInstance(){
       return SingletonDemo.instance;
    }
}
