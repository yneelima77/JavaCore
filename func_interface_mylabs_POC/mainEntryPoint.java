package com.perscholas.func_interface_mylabs_POC;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Function;
public class mainEntryPoint {
    public static void main(String[] args) {
        List<Student> listOfStudents = new ArrayList<>();
        listOfStudents.add(new Student(111, "John", 81.0, "Mathematics"));
        listOfStudents.add(new Student(222, "Harsha", 79.5, "History"));
        listOfStudents.add(new Student(333, "Ruth", 87.2, "Computers"));
        listOfStudents.add(new Student(444, "Aroma", 63.2, "Mathematics"));
        listOfStudents.add(new Student(555, "Zade", 83.5, "Computers"));
        listOfStudents.add(new Student(666, "Xing", 58.5, "Geography"));
        listOfStudents.add(new Student(777, "Richards", 72.6, "Banking"));
        listOfStudents.add(new Student(888, "Sunil", 86.7, "History"));
        listOfStudents.add(new Student(999, "Jordan", 58.6, "Finance"));
        listOfStudents.add(new Student(101010, "Chris", 89.8, "Computers"));

        //====================================
        // a) Predicate – Tests an object
        //====================================
        // Imagine an operation where you want only a list of “Mathematics”
        // students from the above listOfStudents. Let’s see how to do it using Predicate.

        // WHAT YOU NEED TODO:
        // Lambda expression implementing Predicate : Checking specialization of a Student for “Mathematics”
        List<Student> mathematicsStudent = new ArrayList<Student>();
        MathematicsPredicate mathematicsPredicate = (Student student) -> student.getSpecialization().equals("Mathematics");

        for (Student student : listOfStudents) {
            if (mathematicsPredicate.test(student)) {
                mathematicsStudent.add(student);
            }
        }
        System.out.println("\n==============> Dump Math list...");
        //Iterate through mathStudents list
        Iterator<Student> MathS = mathematicsStudent.iterator();
        while (MathS.hasNext()) {
            System.out.println(MathS.next());
        }
        //====================================
        // b) Consumer – Consumes an object
        //====================================

        // Consumer represents an operation which takes an argument and returns nothing.
        // Use this functional interface If you want to compose a lambda expression which
        // performs some operations on an object.

        // For example, displaying all students with their percentage.
        // Lambda expression implementing Consumer : Displaying all students with
        // their percentage
        System.out.println("\n==============> Students with their percentage...");
        Consumer<Student> percentageConsumer = (Student student) -> {
            System.out.println(student.getName() + ": " + student.getPercentage());
        };

        for (Student studentPerc : listOfStudents) {
            percentageConsumer.accept(studentPerc);
        }

        //====================================
        // c) Function – Applies to an object
        //====================================

        // Function represents an operation which takes an argument of type T and
        // returns a result of type R. Use this functional interface if you want to
        // extract some data from  existing data.

        // For example, extracting only the names from listOfStudents.

        // Lambda expression implementing Function : Extracting only the names of all students

        Function<Student, String> nameFun = (Student student) -> student.getName();
        List<String> studentsName = new ArrayList<>();
        for (Student s: listOfStudents){
            studentsName.add(nameFun.apply(s));
        }
        System.out.println("\n==============> Dump Student Name list...");
        Iterator<String> names = studentsName.iterator();
        while (names.hasNext()){
            System.out.println(names.next());
        }
        //====================================
        // d) Supplier – Supplies the objects
        //====================================

        // Supplier represents an operation which takes no argument and returns
        // the results of type R. Use this functional interface when you want to
        // create new objects.

        // Lambda expression implementing Supplier : Creating a new Student
        Supplier<Student> studentSupplier = ()-> new Student(1111, "New Student", 92.9, "Java 8");
        listOfStudents.add(studentSupplier.get());

        System.out.println("\n==============> Dump Additional Student list...");
        Iterator<Student>  stuIter = listOfStudents.iterator();
        while (stuIter.hasNext()) {
            System.out.println(stuIter.next());
        }

    }
}
