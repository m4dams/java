package com.company;

class AppendAFunc {
    public static void main(String[] args) {
        String typo = "Chinchill";
        System.out.println(appendAFunc(typo));
    }

    static String appendAFunc(String input) {
        return input += "a";
    }
}