package org.example;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string to hash: ");
        String input = scanner.nextLine();

        String hash = HashUtils.JOAATHash(input);
        System.out.println("Hash of '" + input + "' is: " + hash);
    }
}