package com.example.firstappdemo;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class QuartzService {
    @Scheduled(fixedRate = 1000)
    public void timerToZZP(){
        System.out.println(TestTask.a);
    }
}
