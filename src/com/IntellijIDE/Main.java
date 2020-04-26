package com.IntellijIDE;
import com.subbu.MathOp.MathOperation;
import com.subbu.calculator.*;


public class Main {

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        MathOperation math = new MathOperation();
        Integer result = calc.Add(10,15);
        System.out.println(math.Big(20,40));

        System.out.println(result);
    }
}
