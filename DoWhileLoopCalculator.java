package com.example.javatutotial;

import java.util.Scanner;

public class DoWhileLoopCalculator {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);

        int n1,n2;
        char c;

    do {


        System.out.println("Enter n1: ");
        n1 = in.nextInt();
        System.out.println("Enter n2: ");
        n2 = in.nextInt();

        System.out.println("Enter one of these operators");
        System.out.println("(*) -> Multiply");
        System.out.println("(/) -> Division");
        System.out.println("(%) -> Remainder");
        System.out.println("(+) -> Addition");
        System.out.println("(-) -> Subtraction");
        System.out.println("Or press q to exit");

        c = in.next().charAt(0);
        switch (c) {
            case '*':
                System.out.println("res = " + (n1 * n2));
                break;

            case '/':
                System.out.println("res = " + (n1 / n2));
                break;

            case '%':
                System.out.println("res = " + (n1 % n2));
                break;

            case '+':
                System.out.println("res = " + (n1 + n2));
                break;

            case '-':
                System.out.println("res = " + (n1 - n2));
                break;


        }

        System.out.println("Thank you");

    }while (c!= 'q');
    }
}
