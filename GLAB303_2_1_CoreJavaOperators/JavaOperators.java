package com.perscholas.GLAB303_2_1_CoreJavaOperators;
public class JavaOperators {
    public static void main(String[] args) {
        JavaOperators javaOperators = new JavaOperators();
        javaOperators.UnaryOperatorExample(10);
        javaOperators.ArithmeticOperatorExample(5,10);
        javaOperators.LogicalAndBitwise(2,5,7);
        javaOperators.AssignmentOperator(5,10);
        javaOperators.TernaryOperator(5,7);
        javaOperators.LeftAndRightShiftOperators();
    }
    public void UnaryOperatorExample(int x){
        System.out.println(x++ + ++x);
        System.out.println(++x);
        System.out.println(x--);
        System.out.println(--x);
    }
    public void ArithmeticOperatorExample(int a, int b){
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a%b);
        System.out.println(a*b/a+b-a*b/2);
    }
    public void LogicalAndBitwise(int a,int b, int c){
        System.out.println(a<b&&a++<c);
        System.out.println(a);
        System.out.println(a<b&a++<c);
        System.out.println(a);
        System.out.println(a>b||a<c);
        System.out.println(a>b|a<c);
        System.out.println(a>b||a++<c);
        System.out.println(a);
        System.out.println(a>b|a++<c);
        System.out.println(a);
    }
    public void TernaryOperator(int a, int b){
        int min=(a<b)?a:b;
        System.out.println(min);
    }
    public void AssignmentOperator(int a, int b){
        a+=4;
        b-=4;
        a*=2;
        a/=2;
        System.out.println(a);
        System.out.println(b);
    }
    public void LeftAndRightShiftOperators(){
        //Right shift
        System.out.println(10>>2);//10/2^2
        System.out.println(20>>3);//20/2^3
        //left shift
        System.out.println(10<<2);//10*2^2
        System.out.println(15<<4);//15*2^4
    }


}
