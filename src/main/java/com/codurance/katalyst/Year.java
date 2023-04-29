package com.codurance.katalyst;

import java.util.function.BooleanSupplier;

public class Year {
    
    private int value;
    protected Year(int value){
        this.value = value;
    }
    public static Year create(int year){
        return new Year(year);
    }
    public boolean isLeapYear() {
        return null;
    }
}
