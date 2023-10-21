package com.tersa.calculatorspringdemo;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService {
    public String plusNum( Integer number1,  Integer number2) {
        return "Вывод:" + number1 + "+" + number2 + "=" + (number1 + number2);
    }

    public String minusNum(Integer number1, Integer number2) {
        return "Вывод:" + number1 + "-" + number2 + "=" + (number1 - number2);
    }
    public String multiplyNum(Integer number1,  Integer number2) {
        return "Вывод:" + number1 + "*" + number2 + "=" + (number1 * number2);
    }
    public String devideNum(Integer number1, Integer number2) {
        return "Вывод:" + number1 + "/" + number2 + "=" + (number1 / number2);

    }


}
