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

        System.out.println("Reversed string: " + reversedWord);

    }
}
