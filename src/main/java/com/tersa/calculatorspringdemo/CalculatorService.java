package com.tersa.calculatorspringdemo;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService {
    public Integer plusNum( Integer number1,  Integer number2) {
        Integer sum = null;
        if (number1!=null & number2!=null) {
            sum = number1 + number2;
        }
        return sum;
    }

    public Integer minusNum(Integer number1, Integer number2) {
        Integer sum = null;
        if (number1!=null & number2!=null) {
            sum = number1 - number2;
        }
        return sum;
    }
    public Integer multiplyNum(Integer number1,  Integer number2) {
        Integer sum = null;
        if (number1!=null & number2!=null) {
            sum = number1 * number2;
        }
        return sum;
    }
    public Integer devideNum(Integer number1, Integer number2) {
        Integer sum = null;
        if (number1!=null & number2!=null) {
            sum = number1 / number2;
        }
        return sum;
    }

    public String check(Integer number1, Integer number2) {
        String a = "число не ноль";
        if (number1==0||number2==0){
            a = "Eror";
        }
        return a;
    }
}
