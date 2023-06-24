package com.perscholas.nul_ptr_lab303_12;

public class ThrowableExample {
    public static void main(String[] args) throws Exception {
        try{
            testException();
        }catch (Throwable e){
            System.out.println("Exception: "+ e.toString());
        }
    }

    public static void testException() throws Exception{
        throw new Exception("Thrown an exception");

    }
}
