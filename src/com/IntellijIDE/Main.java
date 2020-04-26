package com.IntellijIDE;
import com.subbu.calculator.*;


public class Main {

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        Integer result = calc.Add(10,15);

        System.out.println(result);
    }
}
