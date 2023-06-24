package com.perscholas.java_basics;
public class Javabasics {
    public static void main(String[] args) {
        sumofint(10, 20);
        sumofdouble(5.998, 4.786);
        sumof_int_double(19, 7.46645);
        divison_of_integers(23, 13);
        divison_of_doubles(4.655, 12.565);
        TypeCasting(15, 3);
        Constants_BMIcalc(120.56, 75);
        SalesTax(3, 4, 1);
    }
    public static int sumofint(int a, int b){
        int s = a + b;
        System.out.println(s);
        return s;
    }
    public static double sumofdouble(double a, double b){
        double s = a + b;
        System.out.println(s);
        return s;
    }
    public static double sumof_int_double(int a, double b){
        double s = a + b;
        System.out.println(s);
        return s;
    }
    public static double divison_of_integers(int a, int b){
        int div = b/a;
        System.out.println("Division of integers: "+ div);
        double d = b;
        double div1 = div;
        div1 = d/a;
        System.out.println(div1);
        return div;
    }
    public static double divison_of_doubles(double a, double b){
        double div = b/a;
        System.out.println("Division of doubles: "+ div);
        div = (int)div;
        System.out.println(div);
        return div;
    }

    public static double TypeCasting(int x, int y){
        int q = y/x;
        System.out.println(q);
        double y1 = y;
        q = (int) y1;
        System.out.println(q);
        return q;
    }
    public static double Constants_BMIcalc(double wt, final double HT){
        double BMI = wt / (HT * HT)*703;
        System.out.println(BMI);
        return BMI;
    }

    public static double SalesTax(int coffee_price, int cappuccino_price, int GreenTea_price){
        int subtotal;
        final double SALES_TAX = 0.06;
        double totalSale;
        subtotal =  coffee_price * 3 + cappuccino_price * 4 + GreenTea_price * 2;
        totalSale = subtotal + (subtotal * SALES_TAX);
        System.out.println(totalSale);
        return totalSale;
    }

    }
