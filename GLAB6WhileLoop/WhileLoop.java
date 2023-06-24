package com.perscholas.GLAB6WhileLoop;

import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
        Guess_theNumber();
        SubtractionQuizLoop();
        SentinelValuedemo();

    }

    public static void Guess_theNumber() {
        int randomNum = (int) (Math.random() * 101);
        System.out.println(randomNum);
        Scanner sc = new Scanner(System.in);
        System.out.println("Guess the number between 0 and 100");
        int guess = -1;

        while (guess != randomNum) {
            System.out.println("enter your guess");
            guess = sc.nextInt();
            if (guess > randomNum) {
                System.out.println("Your guess is too high");
                guess = sc.nextInt();
            } else if (guess == randomNum) {
                System.out.println("Yes, the number is " + randomNum);
            } else
                System.out.println("Your guess is too low");
        }

    }

    public static void SubtractionQuizLoop() {
        final int NUMBER_OF_QUESTION = 5;  //number if questions
        int correctCount = 0;   //number if correct answers
        int count = 0;  //count the number of questions
        String output = "";
        long startTime = System.currentTimeMillis();

        Scanner input = new Scanner(System.in);

        while (count < NUMBER_OF_QUESTION) {
            // 1. Generate two random single-digit integers
            int num1 = (int) (Math.random() * 10);
            int num2 = (int) (Math.random() * 10);

            // 2. If number1 < number2, swap number1 with number2
            if (num1 < num2) {
                int temp = num1;
                num1 = num2;
                num2 = temp;
            }
            // 3. Prompt the student to answer "What is number1 - number2?"

            System.out.println("What is " + num1 + " - " + num2 + " ?");
            int sub = input.nextInt();

            // 4. Grade the answer and display the result
            if (num1 - num2 == sub) {
                System.out.println("You are correct!");
                correctCount++;
            } else {
                System.out.println("Your answer is wrong. " + num1 + " - " + num2 + " should be " + (num1 - num2));
            }
            // Increase the count
            count++;
            output += "\n" + num1 + "-" + num2 + "=" + sub + ((num1 - num2 == sub) ? " correct" : " wrong");
        }

    }

    public static void SentinelValuedemo() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an int value (the program exits if the input is 0): ");
        int input = sc.nextInt();
        int sum = 0;

        while (input != 0) {
            sum += input;
            System.out.print("Enter an int value (the program exits if the input is 0): ");
            input = sc.nextInt();
        }
        System.out.println("The sum is: " + sum);

    }
}
