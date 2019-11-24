package com.example.scheduled;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class ScheduledTest
{
    @Scheduled(fixedRate = 5000)
    public void schedul()
    {
        System.out.println("============================");
    }
}
