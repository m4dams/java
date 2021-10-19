package com.company;

class Greet {
    public static void main(String[] args) {
        String name = "Green Fox";
        greet(name);
    }

    static void greet(String input) {
        System.out.println("Üdv, kedves " + input);
    }

}