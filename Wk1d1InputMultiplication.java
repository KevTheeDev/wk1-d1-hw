package com.example.homework;
import java.util.Scanner;

 public class Wk1d1InputMultiplication {
    public static void main(String[] args) {
        System.out.print('\n' + "This code will multiply the first two numbers you put in. Begin below: " + '\n');
        Scanner in = new Scanner(System.in);
        System.out.print("Input first number: ");
        int firstUserIn = in.nextInt();
        System.out.print("Input second number: " );
        int secondUserIn = in.nextInt();
        System.out.println("FINAL ANSWER: " + firstUserIn * secondUserIn + '\n');
        in.nextLine();
    }
}
