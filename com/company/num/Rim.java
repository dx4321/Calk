package com.company.num;

import java.util.HashMap;
import java.util.Map;

public class Rim implements INum {
    private int value;
    private static Map<String, Integer> rimToIntMap = new HashMap<>();

    static {
        rimToIntMap.put("I", 1);
        rimToIntMap.put("II", 2);
        rimToIntMap.put("III", 3);
        rimToIntMap.put("IV", 4);
        rimToIntMap.put("V", 5);
        rimToIntMap.put("VI", 6);
        rimToIntMap.put("VII", 7);
        rimToIntMap.put("VIII", 8);
        rimToIntMap.put("IX", 9);
        rimToIntMap.put("X", 10);
    }

    public Rim(String value) {
        this.value = parseRim(value);
    }

    @Override
    public int getValue() {

        return value;
    }

    private int parseRim(String value) {
        Integer number = rimToIntMap.get(value);
        if (number == null) {
            throw new IllegalArgumentException("error parse rim value " + number);
        }
        return number;
    }

}
