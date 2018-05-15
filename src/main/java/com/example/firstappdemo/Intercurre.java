package com.example.firstappdemo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.*;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
@RestController
@RequestMapping("test")
public class Intercurre {


    public static void main(String[] args) throws ExecutionException, InterruptedException {

    }
   @RequestMapping("intercurre")
    public void Intercurre(){
        int count = 1000;
        CyclicBarrier cyclicBarrier = new CyclicBarrier(count);
        ExecutorService executorService = Executors.newFixedThreadPool(count);
        for(int i=0;i<count;i++){
            executorService.execute(new TestTask(cyclicBarrier));
        }
        executorService.shutdown();
        while (!executorService.isTerminated()) {
           try {
               Thread.sleep(10);
           } catch (InterruptedException e) {
               e.printStackTrace();
           }
       }
       //return "success";
    }
}
