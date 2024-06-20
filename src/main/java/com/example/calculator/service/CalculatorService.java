package com.example.calculator.service;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService {

    public String add(int num1, int num2) {
        return num1 + " + " + num2 + " = " + (num1 + num2);
    }

    public String subtract(int num1, int num2) {
        return num1 + " - " + num2 + " = " + (num1 - num2);
    }

    public String multiply(int num1, int num2) {
        return num1 + " * " + num2 + " = " + (num1 * num2);
    }

    public String divide(int num1, int num2) {
        if (num2 == 0) {
            throw new IllegalArgumentException("Деление на ноль невозможно");
        }
        return num1 + " / " + num2 + " = " + (num1 / num2);
    }
}
