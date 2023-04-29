package com.codurance.katalyst;

import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.Test;

public class YearTest {
    
    @Test
    public void a_year_is_not_a_leap_year_if_not_divisible_by_4(){
        Year year = Year.create(1997);
        assertFalse(year.isLeapYear());
    }
}