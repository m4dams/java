package com.company;

import java.util.Scanner;
import java.util.stream.IntStream;

class Factorio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Melyik szám faktoriálisát szeretnéd?");
        int number = scanner.nextInt();
        System.out.println(factorioA(number));
        System.out.println(factorioB(number));
    }

    //Plain old loop style
    static int factorioA(int input) {
        int carrier = 1;
        if (input != 0 && input > 0) {
            for (int i = 1; i <= input; i++) {
                carrier *= i;

            }
            return carrier;
        } else if (input == 0) {
            return 1;
        } else {
            return -1;
        }
    }

    //using Stream
    static int factorioB(int input) {
        return IntStream.rangeClosed(2, input).reduce(1, (x, y) -> x * y);
    }
}