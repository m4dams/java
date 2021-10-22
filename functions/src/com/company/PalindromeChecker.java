package com.company;


import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;

public class PalindromeChecker {

    public static void main(String[] args) {
        String testString = "dog goat dad duck doodle never";
        System.out.println(checkForPalindromes(testString));


    }

    public static Set<String> checkForPalindromes(String input) {

        Set<String> palindromesList = new LinkedHashSet<>();
        for (int i = 0; i < input.length(); i++) {
            palindromesList.addAll(findPalindromes(input, i, i + 1));
            palindromesList.addAll(findPalindromes(input, i, i));
        }
        return palindromesList;
    }

    private static Collection<String> findPalindromes(String input, int start, int end) {
        Set<String> palindrome = new LinkedHashSet<>();
        while (start >= 0 && end < input.length() && input.charAt(start) == input.charAt(end)) {
            if ((input.substring(start,end+1).length()>2)) {
                palindrome.add(input.substring(start, end + 1));
            }
            start--;
            end++;
        }
        return palindrome;
    }
    


}
