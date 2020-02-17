package com.company;

import com.company.num.Arab;
import com.company.num.INum;
import com.company.num.Rim;
import com.company.operator.IOperator;

import java.io.BufferedReader;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;

public class Main {


    public static void main(String[] args) throws IOException {
        char[] MyArr = {'+', '-', '*', '/'};
        int koloper = 0;
        int NumIndexoper = 0;

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();

        char[] nameArr = name.toCharArray();
        for (int i = 0; i < name.length(); i++)
            for (int j = 0; j < MyArr.length; j++)
                if (nameArr[i] == MyArr[j]) {
                    koloper++;
                    NumIndexoper = i;
                }

        if (koloper != 1) {
            throw new IllegalArgumentException("col oper != 1");
        }
        NumFactory numFactory = new NumFactory();

        INum firsNum = numFactory.create(name.substring(0, NumIndexoper).trim());
        INum sndNum = numFactory.create(name.substring(NumIndexoper + 1).trim());

        OperatorFactory operatorFactory = new OperatorFactory();
        IOperator iOperator = operatorFactory.create(name.substring(NumIndexoper, NumIndexoper + 1));
        double calculate = iOperator.calculate(firsNum.getValue(), sndNum.getValue());
        if ((firsNum instanceof Rim && sndNum instanceof Rim) || (firsNum instanceof Arab && sndNum instanceof Arab)) {
            System.out.println(calculate);
        } else {
            throw new IllegalArgumentException("not instance of 1 class");
        }


    }
}
