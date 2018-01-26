package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        Scanner cars = new Scanner(System.in);
//        System.out.println("How many cars do you have?");
//        int numberOfCars = cars.nextInt();
//        if (numberOfCars.equals(12)) {
//            System.out.println();

//        }

//        Scanner input = new Scanner(System.in);
//        System.out.println("type a number between 1 - 100: ");
//        int num = input.nextInt();
//       for (int num = 0) {
//           System.out.println();
//       }

//
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter a two-digit integer between 1 and 100: ");
//        int userNum = input.nextInt();
//
//        if ((userNum % 3 == 0) && (userNum % 5 == 0)) {
//            System.out.println("fizz buzz");
//        } else if (userNum % 3 == 0) {
//            System.out.println("fizz");
//        } else if (userNum % 5 == 0) {
//            System.out.println("buzz");
//        } else {
//            System.out.println(userNum);
//        }
//        for (int i = 1; i <= 100; i++) {
//            if (i % 3 == 0 && i % 5 == 0) {
//                System.out.println("Fizz Buzz");
//            } else if (i % 3 == 0) {
//                System.out.println("Fizz");
//            } else if (i % 5 == 0) {
//                System.out.println("Buzz");
//            } else {
//                System.out.println(i);
//            }
//
//
//
//
//
//    }
        Scanner score = new Scanner(System.in);
        System.out.println("what's your score: ");
        int grade = score.nextInt();
        if (grade < 45 && grade >= 0) {
            System.out.println("F");
        } else if (grade >= 45 && grade < 49) {
            System.out.println("D");
        } else if (grade >= 50 && grade < 59) {
            System.out.println("C");
        } else if (grade >= 60 && grade < 80) {
            System.out.println("B");
        } else if (grade >= 80 && grade <= 100) {
            System.out.println("A");
        } else if (grade > 100 && grade < 0) {
            System.out.println("type a number between 0 and 100");
        }


    }

}