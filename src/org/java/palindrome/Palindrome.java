package org.java.palindrome;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String originalWord = scan.nextLine();
        String reversedWord = "";

        for (int i = 0; i < originalWord.length(); i++) {
            reversedWord = originalWord.charAt(i) + reversedWord;
        }

        if (reversedWord.equalsIgnoreCase(originalWord)){
            System.out.println(reversedWord + " è  una parola palindrome");
        } else {
            System.out.println(reversedWord + " non è una parola palindrome");
        }


    }
}
