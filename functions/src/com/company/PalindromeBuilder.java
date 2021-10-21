package com.company;

import java.util.Scanner;

public class PalindromeBuilder {
    public static void main (String[] args){
        Scanner scanner =new Scanner(System.in);
        System.out.println("Please input the string which you would like to convert to a palindrome");
        String userInput= scanner.nextLine();
        System.out.println(palindromeBuilder(userInput));
    }
    static String palindromeBuilder(String input){
        StringBuilder extraChars= new StringBuilder();
        for (int i=input.length()-1; i >= 0; i--) {
            extraChars.append(input.charAt(i));
        }
        return input+extraChars;
    }
}
