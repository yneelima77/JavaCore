package com.perscholas.GLAB10InheritaneandObjectTypeCasting;

public class TestPeople {
    public static void main(String[] args) {
        Person aperson;
        Boy tom;
        Girl jess;

        aperson = new Person("Fred");
        tom = new Boy("Timmy");
        jess = new Girl("Jessica");

        System.out.println(aperson);
        System.out.println(aperson.talk());
        System.out.println(aperson.walk());
        System.out.println();

        System.out.println(tom);
        System.out.println(tom.talk());
        System.out.println(tom.walk());
        System.out.println();

        System.out.println(jess);
        System.out.println(jess.talk());
        System.out.println(jess.walk());
        System.out.println();

        System.out.println((Person)tom);
        System.out.println(((Person)tom).talk());
        System.out.println(((Person)tom).walk());

        System.out.println((Person)jess);
        System.out.println(((Person)jess).talk());
        System.out.println(((Person)jess).walk());
        System.out.println();

        System.out.println(Person.lifeSpan());
        System.out.println(Boy.lifeSpan());
        System.out.println(Girl.lifeSpan());

        System.out.println(((Boy)aperson).talk());

    }


}
