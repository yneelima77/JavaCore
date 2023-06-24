package com.perscholas.java_basics;

import java.util.Scanner;
import java.util.concurrent.atomic.AtomicMarkableReference;
import java.util.logging.XMLFormatter;

public class ControlFlowStatements {
    public static void main(String[] args) {
        /*Program_One(7);
        Program_One(15);

        Program_Two(7);
        Program_Two(15);

        Program_Three(15);

        Program_Four(15);
        Program_Four(5);

        Program_Five();

        Program_Six();*/
        Program_Seven();


    }

    public static void Program_One(int x) {
        if (x < 10) {
            System.out.println("Less than 10");
        }
    }

    public static void Program_Two(int x) {
        if (x < 10) {
            System.out.println("Less than 10");
        } else
            System.out.println("Greater than 10");
    }

    public static void Program_Three(int x) {
        if (x < 10) {
            System.out.println("Less than 10");
        } else if (x > 10 && x < 20) {
            System.out.println("Between 10 and 20");
        } else if (x >= 20) {
            System.out.println("Greater than or equal to 20");
        }

    }

    public static void Program_Four(int x) {
        if (x < 10 || x > 20) {
            System.out.println("Out of range");
        } else if (x > 10 && x < 20) {
            System.out.println("In range");
        }

    }

    public static void Program_Five() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter score: ");
        int score = sc.nextInt();

        if (score >= 90 && score <= 100) {
            System.out.println("A");
        } else if (score >= 80 && score <= 89) {
            System.out.println("B");
        } else if (score >= 70 && score <= 79) {
            System.out.println("C");
        } else if (score >= 60 && score <= 69) {
            System.out.println("D");
        } else if (score < 60) {
            System.out.println("F");
        } else if (score < 0 || score > 100) {
            System.out.println("Score out of range");
        }

    }

    public static void Program_Six() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter day: ");
        int day = sc.nextInt();

        if (day >= 1 && day <= 7) {
            switch (day) {
                case 1:
                    System.out.println("Monday");
                    break;
                case 2:
                    System.out.println("Tuesday");
                    break;
                case 3:
                    System.out.println("Wednesday");
                    break;
                case 4:
                    System.out.println("Thursday");
                    break;
                case 5:
                    System.out.println("Friday");
                    break;
                case 6:
                    System.out.println("Saturday");
                    break;
                case 7:
                    System.out.println("Sunday");
                    break;
            }
        } else
            System.out.println("Out of range");
    }

    public static void Program_Seven() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter Filing status: ");
        String filing_status = sc.nextLine();

        System.out.println("Please enter total income: ");
        int income = sc.nextInt();
        int tax;

        if (filing_status.equalsIgnoreCase("Single")) {
            if (income > 0 && income <= 8350) {
                tax = (income * 10) / 100;
                System.out.println(tax);
            } else if (income >= 8351 && income <= 33950) {
                tax = (income * 15) / 100;
                System.out.println(tax);
            } else if (income >= 33951 && income <= 82250) {
                tax = (income * 25) / 100;
                System.out.println(tax);
            } else if (income >= 82251 && income <= 171550) {
                tax = (income * 28) / 100;
                System.out.println(tax);
            } else if (income >= 171551 && income <= 372950) {
                tax = (income * 33) / 100;
                System.out.println(tax);
            } else if (income >= 372951) {
                tax = (income * 35) / 100;
                System.out.println(tax);
            }
        } else if (filing_status.equalsIgnoreCase("married filing jointly") || filing_status.equalsIgnoreCase("qualifying widow")) {
            if (income > 0 && income <= 16700) {
                tax = (income * 10) / 100;
                System.out.println(tax);
            } else if (income >= 16701 && income <= 67900) {
                tax = (income * 15) / 100;
                System.out.println(tax);
            } else if (income >= 67901 && income <= 137050) {
                tax = (income * 25) / 100;
                System.out.println(tax);
            } else if (income >= 137051 && income <= 208850) {
                tax = (income * 28) / 100;
                System.out.println(tax);
            } else if (income >= 208851 && income <= 372950) {
                tax = (income * 33) / 100;
                System.out.println(tax);
            } else if (income >= 372951) {
                tax = (income * 35) / 100;
                System.out.println(tax);
            }
        } else if (filing_status.equalsIgnoreCase("married filing separately")) {
            if (income > 0 && income <= 8350) {
                tax = (income * 10) / 100;
                System.out.println(tax);
            } else if (income >= 8351 && income <= 33950) {
                tax = (income * 15) / 100;
                System.out.println(tax);
            } else if (income >= 33951 && income <= 68525) {
                tax = (income * 25) / 100;
                System.out.println(tax);
            } else if (income >= 68526 && income <= 104425) {
                tax = (income * 28) / 100;
                System.out.println(tax);
            } else if (income >= 104426 && income <= 186475) {
                tax = (income * 33) / 100;
                System.out.println(tax);
            } else if (income >= 186476) {
                tax = (income * 38) / 100;
                System.out.println(tax);
            }
        } else if (filing_status.equalsIgnoreCase("Head of Household")) {
            if (income >= 0 && income <= 11950) {
                tax = (income * 10) / 100;
                System.out.println(tax);
            } else if (income >= 11951 && income <= 45500) {
                tax = (income * 15) / 100;
                System.out.println(tax);
            } else if (income >= 45501 && income <= 117450) {
                tax = (income * 25) / 100;
                System.out.println(tax);
            } else if (income >= 117451 && income <= 190200) {
                tax = (income * 28) / 100;
                System.out.println(tax);
            } else if (income >= 190201 && income <= 372950) {
                tax = (income * 33) / 100;
                System.out.println(tax);
            } else if (income >= 372951) {
                tax = (income * 38) / 100;
                System.out.println(tax);
            }

        }


    }


}



