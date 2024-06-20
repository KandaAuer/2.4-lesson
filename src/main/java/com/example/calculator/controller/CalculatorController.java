package com.example.calculator.controller;

import com.example.calculator.service.CalculatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {

    @Autowired
    private CalculatorService calculatorService;

    @GetMapping
    public String welcome() {
        return "Добро пожаловать в калькулятор";
    }

    @GetMapping("/plus")
    public String add(@RequestParam Integer num1, @RequestParam Integer num2) {
        if (num1 == null || num2 == null) {
            return "Ошибка: параметры num1 и num2 обязательны";
        }
        return calculatorService.add(num1, num2);
    }

    @GetMapping("/minus")
    public String subtract(@RequestParam Integer num1, @RequestParam Integer num2) {
        if (num1 == null || num2 == null) {
            return "Ошибка: параметры num1 и num2 обязательны";
        }
        return calculatorService.subtract(num1, num2);
    }

    @GetMapping("/multiply")
    public String multiply(@RequestParam Integer num1, @RequestParam Integer num2) {
        if (num1 == null || num2 == null) {
            return "Ошибка: параметры num1 и num2 обязательны";
        }
        return calculatorService.multiply(num1, num2);
    }

    @GetMapping("/divide")
    public String divide(@RequestParam Integer num1, @RequestParam Integer num2) {
        if (num1 == null || num2 == null) {
            return "Ошибка: параметры num1 и num2 обязательны";
        }
        try {
            return calculatorService.divide(num1, num2);
        } catch (IllegalArgumentException e) {
            return e.getMessage();
        }
    }
}
