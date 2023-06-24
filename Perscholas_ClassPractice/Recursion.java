package Perscholas_ClassPractice;

import com.perscholas.func_interface_mylabs_POC.FunctionJavaUtil;

public class Recursion {
    public static void main(String[] args) {
        Recursion r = new Recursion();
        System.out.println(r.fib(10));
    }

    int fib(int n) {
        if(n <=1)
            return 1;
        else
            return fib(n -1) + fib(n -2);
    }
}
