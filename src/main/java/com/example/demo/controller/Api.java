package com.example.demo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Api {

    /**
     *  This controller only accessible after login
     *  Login implemented using Spring Security page login (Session)
     *  Not JWT or something
     */

    @RequestMapping(path = "/find", method = RequestMethod.GET)
    public ResponseEntity<Object> findSomeData() {
        /**
         * Get some data by using JPA find by Id and assign it to RestAPi Response Pojo by
         *  response.setData(repository.findById(1));
         *  and Return it through ResponseEntity
         */
        return ResponseEntity.ok().build();
    }
}
