package com.company;

import java.util.Scanner;
import java.util.function.UnaryOperator;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double sun = scanner.nextDouble();
        System.out.println(sqrt().apply(sun));



    }
    public static UnaryOperator<Double> sqrt(){
        UnaryOperator <Double> unaryOperator = x -> Math.sqrt(x);
        return unaryOperator;
    }
}

