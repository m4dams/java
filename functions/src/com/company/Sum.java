package com.company;

import java.util.Scanner;
import java.util.stream.IntStream;

class Sum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Addj meg egy számot, összeadom a számokat\n" +
                "nullától a bemeneti paraméterig és visszaadom azok összegét.");
        int number = scanner.nextInt();
        System.out.println(sumA(number));
        System.out.println(sumB(number));

    }
    //Loop style
    static int sumA(int input) {
        for (int i = input - 1; i > 0; i--) {
            input += i;
        }
        return input;
    }
    //Stream
    static int sumB(int input){
        return IntStream.rangeClosed(2, input).reduce(1, (x, y) -> x + y);
    }
}