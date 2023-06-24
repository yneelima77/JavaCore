package Perscholas_ClassPractice.genericTypes;

public class GenericMethodExample {
    public <T> void printValues(T value){
        System.out.println("Values: "+value);
    }
    public static <T> void staticDisplay(T value){
        System.out.println("Values: "+value);
    }

    public <E> void printArray(E[] values){
        for(E element : values){
            System.out.println(element);
        }
        System.out.println();
    }


}
