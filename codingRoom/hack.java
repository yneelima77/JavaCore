package codingRoom;

public class hack {
    public static void main(String[] args) {
        MyFunctionalInterface fi = (int x) -> x;
        System.out.println(fi.sqr(5));

        MyFunctionalInterface functionalInterface = s-> {return s+s;};
        System.out.println(fi.sqr("hello"));
        //Which of the following statement(s) are true about ArrayList<E>? (Select all that are correct)
        /*  An ArrayList<String> provides type-safety by only allowing adding objects of type String.
  The indexing operator [] can be used to get/set elements of an ArrayList, just like it can be used on an array.
  The number of elements in an ArrayList cannot be changed after it is instantiated.
  The number of elements currently in an ArrayList is available using the size() method.


  The core components of Java NIO are:
    Scanner
  Non-blocking I/O
  Channels
  Selectors
  Buffers


  Can we deﬁne a Functional Interface without using the "@FunctionalInterface" annotation?*/
    }
    }

