package org.example;

import static java.lang.Math.*;

public class Math {
    public static void main(String[] args) {
        double x = 0.5, a = -3, b = 4, c = 1.2;

        // Перша частина: e^(cubic root((ax^2 - b) / (c + x)))
        double ax2_minus_b = a * pow(x, 2) - b;       // Обчислення ax^2 - b
        double denominator1 = c + x;                 // c + x
        double cubicRoot = cbrt(ax2_minus_b / denominator1); // Кубічний корінь
        double expPart = exp(cubicRoot);             // eкспонента

        // Друга частина: cos(ax) / e^((x + b) / c)
        double cosPart = cos(a * x);                 // cos(ax)
        double denominator2 = exp((x + b) / c);      // e^((x + b) / c)
        double fractionPart = cosPart / denominator2; // Ділення

        // Загальний результат
        double result = expPart + fractionPart;

        // Виведення результату
        System.out.printf("Result: %.3f\n", result);
    }
}