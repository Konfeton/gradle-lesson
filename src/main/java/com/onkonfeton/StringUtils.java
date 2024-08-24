package com.onkonfeton;

public class StringUtils {
    public boolean isPositiveNumber(String str){
        if (str == null || str.isEmpty()) {
            return false;
        }
        try {
            return Double.parseDouble(str) > 0;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}