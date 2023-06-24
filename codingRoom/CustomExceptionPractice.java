package codingRoom;

import java.util.Scanner;

public class CustomExceptionPractice {

    public static void main(String[] args) throws MyException {
        /// Method
       MyException.TypingPractice.typeABC();
    }
}

/// Create a class called MyException that extends Exception.
class MyException extends Exception {
    MyException(String str) {
        super(str);
    }

    // Create class typingPractice with a static void method call typeABC
    class TypingPractice {
        static void typeABC() throws MyException {

            try {
                Scanner sc = new Scanner(System.in);
                String s = sc.next();
                String input = "abc";
                if (!s.equals(input)) {
                    throw new MyException("incorrect input");
                }
            } catch (Exception ex) {
                ex.getMessage();
            }
        }
    }
}



