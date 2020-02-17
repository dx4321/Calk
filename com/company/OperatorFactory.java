package com.company;

import com.company.operator.*;

public class OperatorFactory {
    public IOperator create(String val) {
        switch (val) {
            case "+":
                return new SumOperator();
            case "-":
                return new MinusOperator();
            case "*":
                return new MultiplyOperator();
            case "/":
                return new DivideOperator();
            default:
                throw new IllegalArgumentException("error operator " + val);
        }
    }
}
