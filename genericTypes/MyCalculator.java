package Perscholas_ClassPractice.genericTypes;

public class MyCalculator {
    public long power(int n, int p) throws Exception{
        double pow= Math.pow(n, p);
        long po = (long)pow;

        if(n == 0 && p == 0){
            throw new Exception("n and p should not be zero.");
        }
        else if(n < 0 || p < 0){
            throw new Exception("n or p should not be negative.");
        }
        System.out.println(po);
        return po;

    }}
