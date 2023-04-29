package com.codurance.katalyst;

public class Year {
    
    private int value;
    protected Year(int value){
        this.value = value;
    }
    public static Year create(int year){
        return new Year(year);
    }
    public boolean isLeapYear() {
        if(isDivisibleBy(100)){
            return isDivisibleBy(400);
        }
        return isDivisibleBy(4);
    }
    private boolean isDivisibleBy(int num){
        return value % num == 0;
    }
}
