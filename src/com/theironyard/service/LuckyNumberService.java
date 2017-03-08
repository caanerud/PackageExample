package com.theironyard.service;

import com.theironyard.bean.LuckyNumber;

import java.util.Random;

/**
 * Created by doug on 3/8/17.
 */
public class LuckyNumberService {

    private Random rand = new Random();

    // give my a random number (lucky or otherwise)
    public LuckyNumber newNumber(){
        LuckyNumber number = new LuckyNumber(
                this.rand.nextLong(),
                this.rand.nextBoolean()
        );

        return number;
    }

    // give me a lucky number
    public LuckyNumber newLuckyNumber(){
        LuckyNumber number = new LuckyNumber(
                this.rand.nextLong(),
                true
        );

        return number;
    }

    // give me an unlucky number
    public LuckyNumber newUnluckyNumber(){

        LuckyNumber number = new LuckyNumber(
                this.rand.nextLong(),
                false
        );

        return number;
    }

}
