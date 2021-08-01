package com.calculator;

public class ArithmeticOperations {

    public static void add (double x, double y){
        double add = x + y;
        System.out.println("Ответ сложения равен: "+add);
    }

    public static void sub (double x, double y){
        double sub = x - y;
        System.out.println("Ответ вычитания равен: "+sub);
    }

    public static void mult (double x, double y){
        double mult = x * y;
        System.out.println("Ответ умножения равен: "+mult);
    }

    public static void div (double x, double y){
        if (y!=0){
            double div = x / y;
            System.out.println("Ответ деления равен: "+div);
        } else {
            System.out.println("На ноль делить нельзя");
        }

    }

    public static void pow (double x, double y){
       double pow = Math.pow(x,y);
        System.out.println("Ответ возведения в степень равен: "+pow);
    }

    public static void root (double x, double y){
        double root = Math.pow(x,(1/y));
        System.out.println("Ответ вычисления корня равен: "+root);
    }

}


