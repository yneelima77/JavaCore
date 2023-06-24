package Perscholas_ClassPractice.genericTypes;

public class GenericMethods_Runner {
    public static void main(String[] args) {
        GenericMethodExample obj = new GenericMethodExample();

        obj.printValues(30);
        obj.printValues("Sting object");
        obj.printValues(20.10);
        obj.printValues(true);

        GenericMethodExample.staticDisplay("static method");
        GenericMethodExample.staticDisplay(40);
        GenericMethodExample.staticDisplay(10.34);
        GenericMethodExample.staticDisplay(true);

        Integer[] intAry = { 10, 20, 30, 40, 50 };
        Character[] charAry = { 'J', 'A', 'V', 'A'};
        obj.printArray(intAry);
        obj.printArray(charAry);

        System.out.println("BoundedTypeParameters Class");
        // initialize generic class(Bounded Type parameter) with Integer value
        BoundedTypeParameters<Integer> bTypeObj1 = new BoundedTypeParameters<>(22);
        // initialize generic class with double value
        BoundedTypeParameters<Double> bTypeObj2 = new BoundedTypeParameters<>(22.10);
        System.out.println(bTypeObj1.sqRt());
        System.out.println(bTypeObj2.sqRt());
        // initialize generic class with String value
       /* BoundedTypeParameters<String> bTypeObj3 = new BoundedTypeParameters<>("Per Scholas");
        System.out.println(bTypeObj3.sqRt());*/






    }
}
