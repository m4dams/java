package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("give me 2 strings and i will tell you if they\n" +
                "are each others anagrams or not\n" +
                "First string:");
        String firstString = scanner.nextLine();
        System.out.println("Second string:");
        String secondString = scanner.nextLine();
        System.out.println("Is anagram: " + isAnagram(firstString, secondString));
    }

    private static boolean isAnagram(String firstInputString, String secondInputString) {
        char[] firstCharArray = firstInputString.toCharArray();
        char[] secondCharArray = secondInputString.toCharArray();
        Arrays.sort(firstCharArray);
        Arrays.sort(secondCharArray);
        return Arrays.equals(firstCharArray, secondCharArray);
    }
}
