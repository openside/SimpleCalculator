package ir.openuniverse;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
    
        System.out.print("Enter first number: ");
        int a = scanner.nextInt();
    
        System.out.print("Enter Second number: ");
        int b = scanner.nextInt();
    
        int c = a + b;
    
        System.out.println("The sum is " + c + ".");
    }
}
