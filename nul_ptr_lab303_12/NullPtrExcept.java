package com.perscholas.nul_ptr_lab303_12;

public class NullPtrExcept {
    public static void main(String[] args) {
        String ptr = "";

        try {

            if (ptr.equals("gfg"))
                System.out.print("Same");
            else
                System.out.print("Not Same");
        } catch (NullPointerException e) {
            System.out.print("NullPointerException Caught");
        }
    }

}
