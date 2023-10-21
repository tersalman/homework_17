package com.tersa.calculatorspringdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/calculator")
public class CalculatorController {
    private final CalculatorService calculatorService;

    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping
    public String hello() {
        return "Добро пожаловать в калькулятор";
    }

    @GetMapping(path = "/plus")
    public String plusNum(@RequestParam(name = "Num1",required = false) Integer number1,
                          @RequestParam(name = "Num2",required = false) Integer number2) {
        if (number1 == null || number2 == null) {
            return "fill request in right form";
        }
        return calculatorService.plusNum(number1, number2);
    }

    @GetMapping(path = "/minus")
    public String minusNum(@RequestParam(name = "Num1",required = false) Integer number1,
                           @RequestParam(name = "Num2",required = false) Integer number2) {
        if (number1 == null || number2 == null) {
            return "fill request in right form";
        }
        return calculatorService.minusNum(number1, number2);
    }

    @GetMapping(path = "/multiply")
    public String multiplyNum(@RequestParam(name = "Num1",required = false) Integer number1,
                              @RequestParam(name = "Num2",required = false) Integer number2) {
        if (number1 == null || number2 == null) {
            return "fill request in right form";
        }
        return calculatorService.multiplyNum(number1, number2);
    }

    @GetMapping(path = "/devide")
    public String devideNum(@RequestParam(name = "Num1",required = false) Integer number1,
                            @RequestParam(name = "Num2",required = false) Integer number2) {
        if (number1 == null || number2 == null) {
            return "fill request in right form";
        }
        if (number2.equals(0)) {
            return "you cannot devide on a zero";
        }
        return calculatorService.devideNum(number1, number2);

    }


}
