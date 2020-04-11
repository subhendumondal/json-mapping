package com.example.demo.executor;


import org.springframework.stereotype.Component;
import org.springframework.scheduling.annotation.Scheduled;

@Component
public class Sync {

    private Exec execImpl;

    public Sync(Exec execImpl) {
        this.execImpl = execImpl;
    }

    @Scheduled(cron = "0 * * * * ?")
    public void runEveryMinute(){
        execImpl.run();
    }
}
