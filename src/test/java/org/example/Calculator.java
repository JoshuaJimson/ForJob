package org.example;

import java.util.Scanner;

public class Calculator {
    static Scanner s = new Scanner(System.in);
    public static void calc(){
        System.out.println("*****CALCULATOR FOR TWO NUMBERS*******");
        CalcFunctions c = new CalcFunctions();
        System.out.print("Enter the first number: ");
        int a = s.nextInt();
        System.out.print("Enter the second number: ");
        int b = s.nextInt();
        System.out.println();
        System.out.println("Addition= " + c.add(a, b));
        System.out.println("Subtraction= " + c.sub(a, b));
        System.out.println("Division= " + c.div(a, b));
        System.out.println("Multiplication= " + c.mul(a, b));
        System.out.println("Modulus= " + c.mod(a, b));
    }
     public static void main(String[] args){
        do{
            calc();
            System.out.print("Press 1 to continue with new numbers (0 to close calculator): ");
        }while(s.nextInt()==1);
     }

}
