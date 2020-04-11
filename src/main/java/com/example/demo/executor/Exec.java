package com.example.demo.executor;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public interface Exec {

    @Async
    @Transactional
    public void run();
}
