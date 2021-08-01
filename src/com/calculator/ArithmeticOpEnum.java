package com.calculator;

public enum ArithmeticOpEnum {
    ADD {
        public void apply(double x, double y) {
            double add = x + y;
            System.out.println("Ответ сложения равен: "+add);
        }
    },

    SUBTRACT {
        public void apply(double x, double y) {
            double sub = x - y;
            System.out.println("Ответ вычитания равен: "+sub);
        }
    },

    MULT {
        public void apply(double x, double y) {
            double mult = x * y;
            System.out.println("Ответ умножения равен: "+mult);
        }
    },

    DIV {
        public void apply(double x, double y) {
            if (y!=0){
                double div = x / y;
                System.out.println("Ответ деления равен: "+div);
            } else {
                System.out.println("На ноль делить нельзя");
            }
        }
    },

    POV {
        public void apply(double x, double y) {
            double pow = Math.pow(x,y);
            System.out.println("Ответ возведения в степень равен: "+pow);
        }
    },

    ROOT {
        public void apply(double x, double y) {
            if (x>=0) {
            double root = Math.pow(x,(1/y));
            System.out.println("Ответ вычисления корня равен: "+root);
            } else {
                System.out.println("Нельзя посчитать корень из отрицательного числа");
            }

        }
    },
    ;

    public abstract void apply(double a, double b);

}
