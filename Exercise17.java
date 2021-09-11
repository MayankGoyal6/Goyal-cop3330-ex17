/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution, Exercise 17
 *  Copyright 2021 Mayank Goyal
 */

import java.util.Scanner;

class Main {
  public static void main(String[] args) {
  
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter a 1 if you are male or a 2 if you are female: ");
    int gender = scanner.nextInt();

    System.out.print("How many ounces of alcohol did you have? ");
    int ounces = scanner.nextInt();

    System.out.print("What is your weight, in pounds? ");
    int weight = scanner.nextInt();

    System.out.print("How many hours has it been since your last drink? ");
    int hours = scanner.nextInt();

    float rate = (gender == 1) ? (float) 0.73 : (float) 0.66;

    double BAC = (ounces * 5.14/weight * rate) - (0.015 * hours);

    String message = (BAC < 0.08) ? ("It is legal for you to drive."):("It is not legal for you to drive.");
    System.out.println("Your BAC is " + BAC + "\n" + message);

  }
}