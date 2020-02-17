package com.company.num;

public class Arab implements INum {

    private int value;

    public Arab(int value) {
        this.value = value;
    }

    @Override
    public int getValue() {
        return value;
    }
}
