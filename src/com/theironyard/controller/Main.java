package com.theironyard.controller;

import com.theironyard.bean.LuckyNumber;
import com.theironyard.service.LuckyNumberService;

/**
 * Created by doug on 3/8/17.
 */
public class Main {

    public static void main(String[] args) {

        LuckyNumberService service = new LuckyNumberService();

        LuckyNumber number = service.newNumber();

        System.out.println( number );

    }
}
