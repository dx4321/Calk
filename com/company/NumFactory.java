package com.company;

import com.company.num.Arab;
import com.company.num.INum;
import com.company.num.Rim;

public class NumFactory {

    public INum create(String value) {
        if (isNumeric(value)) {
            Arab arab = new Arab(Integer.parseInt(value));
            if (arab.getValue() > 10 || arab.getValue() < 1) {
                throw new IllegalArgumentException("not right values: " + arab.getValue());
            }
            return arab;
        } else return new Rim(value);
    }

    private boolean isNumeric(String strNum) {
        if (strNum == null) {
            return false;
        }
        try {
            int d = Integer.parseInt(strNum);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }

}
