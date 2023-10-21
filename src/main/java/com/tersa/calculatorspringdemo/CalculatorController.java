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
    public String plusNum(@RequestParam("Num1") Integer number1, @RequestParam("Num2") Integer number2) {
    String a = Integer.toString(calculatorService.plusNum(number1, number2));
    return "Вывод:"+ number1+ "+"+number2+ "="+ a;
    }

    @GetMapping(path = "/minus")
    public String minusNum(@RequestParam("Num1") Integer number1, @RequestParam("Num2") Integer number2) {
         String a = Integer.toString(calculatorService.minusNum(number1, number2));
         return a;
    }
    @GetMapping(path = "/multiply")
    public String multiplyNum(@RequestParam("Num1") Integer number1, @RequestParam("Num2") Integer number2) {
        String a = Integer.toString(calculatorService.multiplyNum(number1, number2));
        return a;
    }
    @GetMapping(path = "/devide")
    public String devideNum(@RequestParam("Num1") Integer number1, @RequestParam("Num2") Integer number2) {
        String b =calculatorService.check(number1,number2);
         String a = Integer.toString(calculatorService.devideNum(number1, number2));
         return b+a;

    }


}
