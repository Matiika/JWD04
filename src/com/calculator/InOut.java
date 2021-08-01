package com.calculator;

import java.util.Scanner;
import com.calculator.ArithmeticOpEnum;

public class InOut {

    public static void sendRequest(){
        Scanner sc = new Scanner(System.in);
        boolean check = true;
        int a1 = 0;

        while (check) {
            System.out.println("Воспользуетесь калькулятором? Введите '1', если да или любое другое значение, если нет");
            a1 = sc.nextInt();

            if (a1==1){
                loopChoose();
            } else {
                check = false;
            }
        }
    }

    public static void loopChoose(){
        System.out.println("Какое действите хотите совершить: \n" +
                "1 - Сложение \n" +
                "2 - Вычитание \n" +
                "3 - Умножение \n" +
                "4 - Деление \n" +
                "5 - Возведение в степень \n" +
                "6 - Подсчет корня");

        Scanner sc = new Scanner(System.in);
        int a1 = sc.nextInt();
        chooseOperation(a1);
    }

    public static void chooseOperation (int x){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите первое число:");
        double a1 = sc.nextDouble();

        System.out.println("Введите второе число:");
        double a2 = sc.nextDouble();

        ArithmeticOpEnum.values()[x-1].apply(a1, a2);

//        switch (x){
//            case 1: ArithmeticOperations.add(a1,a2);
//            break;
//
//            case 2: ArithmeticOperations.sub(a1,a2);
//            break;
//
//            case 3: ArithmeticOperations.mult(a1,a2);
//                break;
//
//            case 4: ArithmeticOperations.div(a1,a2);
//                break;
//
//            case 5: ArithmeticOperations.pow(a1,a2);
//                break;
//
//            case 6: ArithmeticOperations.root(a1,a2);
//                break;
//
//            default: System.out.println("Такого числа нет");
//            break;
//        }

    }

}

