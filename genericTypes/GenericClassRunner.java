package Perscholas_ClassPractice.genericTypes;

public class GenericClassRunner {
    public static void main(String[] args) {
        GenericClass<Integer> intObj = new GenericClass<Integer>(10);
        System.out.println(intObj.getData());

        GenericClass<String> strObj = new GenericClass<String>("String object");
        System.out.println(strObj.getData());

        ElephantItem<Integer> EleObj = new ElephantItem<>();
        EleObj.move(5,"ABC");
        System.out.println(EleObj.getItembeingmoved());
        System.out.println(EleObj.getLocationBeingMovedTo());

    }
}
