package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Enter no. of asterisks");

        Scanner in = new Scanner(System.in);
        int num1 = in.nextInt();
        int num2 = num1;
        int asteriskCount = -1;
        int spaceNum = num1;

        while (num1-- > 0) {
            asteriskCount += 2;
            spaceNum--;
            int c = asteriskCount;
            int sp = spaceNum;

            System.out.println("");
            while (sp-- > 0) {
                System.out.print(" ");
            }
            while (c-- > 0) {
                System.out.print("*");
            }
        }

        while (num2-- > 0) {
            asteriskCount -= 2;
            spaceNum++;
            int c = asteriskCount;
            int sp = spaceNum;

            System.out.println("");
            while (sp-- > 0) {
                System.out.print(" ");
            }
            while (c-- > 0) {
                System.out.print("*");
            }
        }

    }
}