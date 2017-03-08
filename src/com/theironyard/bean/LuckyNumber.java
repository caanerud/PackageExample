package com.theironyard.bean;

/**
 * Created by doug on 3/8/17.
 */
public class LuckyNumber {
    private long number;
    private boolean isLucky;

    public LuckyNumber(long number, boolean isLucky) {
        this.number = number;
        this.isLucky = isLucky;
    }

    public long getNumber() {
        return number;
    }

    public void setNumber(long number) {
        this.number = number;
    }

    public boolean isLucky() {
        return isLucky;
    }

    public void setLucky(boolean lucky) {
        isLucky = lucky;
    }

    @Override
    public String toString() {
        if(this.isLucky){
            return "A lucky number of " + this.number;
        } else {
            return "An unlucky number of " + this.number;
        }
    }
}
