package com.perscholas.nul_ptr_lab303_12;

public class NullPtrExcept2 {
    public static void main(String[] args) {
        String s = "";
        try {
            System.out.println(getLength(s));
        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException caught");
        }

        String s1 = "GeeksforGeeks";
        try {
            System.out.println(getLength(s1));
        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException caught");
        }

        s = null;
        try
        {
            System.out.println(getLength(s));
        }
        catch(IllegalArgumentException e)
        {
            System.out.println("IllegalArgumentException caught");
        }

    }

    public static int getLength(String s) {
        int len = s.length();
        return len;
    }
}
