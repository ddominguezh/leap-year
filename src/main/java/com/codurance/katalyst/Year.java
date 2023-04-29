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
        if(value % 100 == 0 && value % 400 != 0){
            return false;
        }
        return value % 4 == 0;
    }
}
