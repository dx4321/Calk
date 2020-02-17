package com.company.operator;

import java.math.BigInteger;

public class MultiplyOperator implements IOperator {
    @Override
    public String symbol() {
        return "*";
    }

    @Override
    public Integer calculate(int val1, int val2) {
        return val1 * val2;
    }
}
