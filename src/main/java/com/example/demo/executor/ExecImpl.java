package com.example.demo.executor;

import org.springframework.stereotype.Service;

@Service
public class ExecImpl implements Exec {

    @Override
    public void run() {
        /**
         * Some async functionality which will
         * update or create row in table
         */
    }
}
