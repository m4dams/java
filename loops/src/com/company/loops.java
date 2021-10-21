package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class loops {

    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        //IWontCheatOnTheExams
        /*for (int i = 0; i < 99; i++) {
            System.out.println("Nem fogok csalni az a vizsgán!");
        }

        //PrintEven
        for (int i = 0; i < 501; i += 2) {
            System.out.println(i);
        }*/

        //MultiplicationTable
        /*System.out.println("A program a megadott számhoz tartozó szorzótáblát írja ki.\n" +
                "Kérlek adj meg egy egész számot(lehet negatív is)");
        int input = scanner.nextInt();
        if (input == 0) {
            System.out.println("Minek akarod a 0-t szorozni? Mindig 0 marad. Nem pazarlom az időt hogy kiirjam neked");
        } else {
            for (int i = 1; i <= Math.abs(input); i++) {
                System.out.println(i + " * " + input + " = " + (i * input));
            }
        }*/

        //CountFromTo
        /*System.out.println("A program két egész számot kér be SPACE-el elválasztva.\n" +
                "El fog számolni az első számtól a másodikig egyesével...\n" +
                "Rajtad áll hány sort ír ki...\n" +
                "Kérlek adj meg 2 db egész számot SPACE-el elválasztva");
        String input = scanner.nextLine();
        String[] numbersIn = input.split(" ");
        if (Integer.valueOf(numbersIn[0]) == Integer.valueOf(numbersIn[1])) {
            System.out.println("Ez most vicc, igaz?");
        } else if (Integer.valueOf(numbersIn[0]) < Integer.valueOf(numbersIn[1])) {
            for (int i = Integer.valueOf(numbersIn[0]); i <= Integer.valueOf(numbersIn[1]); i++) {
                System.out.println(i);
            }
        } else {
            for (int i = Integer.valueOf(numbersIn[0]); i >= Integer.valueOf(numbersIn[1]); i--) {
                System.out.println(i);
            }
        }*/

        //FizzBuzz
        /*for (int i = 0; i < 101; i++) {
            if ((i % 3 == 0) && (i % 5 == 0)) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }*/

        //DrawTriangle
        /*System.out.println("A program bekér egy egész számot majd kirajzol egy háromszöget.\n" +
                "Kérlek adj meg egy egész számot (ne legyen túl nagy...)");
        int rows = scanner.nextInt();
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }*/

        //DrawPyramid
        /*System.out.println("A program bekér egy egész számot majd kirajzol egy piramist.\n" +
                "Kérlek adj meg egy egész számot (ne legyen túl nagy...)");
        int rows = scanner.nextInt();
        for (int i = 1; i <= rows; i++) {
            for (int j = rows - i; j > 0; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k < i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }*/

        //DrawRhombus
        /*System.out.println("A program bekér egy egész számot majd kirajzol egy rombuszt.\n" +
                "Kérlek adj meg egy egész számot (ne legyen túl nagy...)");
        int rows = scanner.nextInt();
        int lineHelper = (rows % 2 == 0) ? (rows / 2) : ((rows / 2) + 1);
        if (rows % 2 != 0) {
            for (int i = 1; i <= lineHelper; i++) {
                for (int j = lineHelper - i; j >= 0; j--) {
                    System.out.print(" ");
                }
                for (int k = 1; k < i; k++) {
                    System.out.print("* ");
                }
                System.out.println();

            }
        } else {
            for (int i = 1; i <= lineHelper; i++) {
                for (int j = lineHelper - i; j > 0; j--) {
                    System.out.print(" ");
                }
                for (int k = 1; k <= i; k++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }

        for (int i = lineHelper; i >= 1; i--) {
            for (int j = lineHelper - i; j > 0; j--) {
                System.out.print(" ");
            }
            for (int k = i; k > 0; k--) {
                System.out.print("* ");
            }
            System.out.println();

        }*/

        //DrawSquare
        /*System.out.println("A program bekér egy egész számot majd kirajzol egy négyzetet.\n" +
                "Kérlek adj meg egy egész számot (ne legyen túl nagy...)");
        int rows = scanner.nextInt();
        String fill = "%";
        for (int i = 1; i <= rows; i++) {
            if (i == 1 || i % rows == 0) {
                for (int j = 0; j < rows; j++) {
                    System.out.print("%");
                }
            } else {
                System.out.print("%");
                for (int j = 0; j < (rows - 2); j++) {
                    System.out.print(" ");
                }
                System.out.print("%");
            }
            System.out.println();
        }*/

        //DrawSquareWithDiagonal
        System.out.println("A program bekér egy egész számot majd kirajzol egy négyzetet átlóval.\n" +
                "Kérlek adj meg egy egész számot (ne legyen túl nagy...)");
        int rows = scanner.nextInt();
        for (int i = 1; i <= rows; i++) {
            if (i == 1 || i % rows == 0) {
                for (int j = 0; j < rows; j++) {
                    System.out.print("%");
                }
            } else {
                System.out.print("%");
                for (int j = 0; j < (rows - 2); j++) {
                    if (j == (i - 2)) {
                        System.out.print("%");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.print("%");
            }
            System.out.println();
        }

        //ParametricAverage

       /* System.out.println("ez az izé bekér egy egész számot, majd utána bekér annyi számot,\n" +
                " mint ammenyit megadtál elsőnek. Aztán kidobja ezeknek összegét és átlagát");
        int cycle = scanner.nextInt();
        ArrayList numbers = new ArrayList();
        int sum = 0;
        for (int i = 0; i < cycle; i++) {
            numbers.add(scanner.nextInt());
            sum += (int) numbers.get(i);
        }

        System.out.println("Összeg: " + sum + "\tÁtlag: " + (sum / numbers.size()));*/

        //DrawChessTable
        /*for (int i = 1; i < 9; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < 4; j++) {
                    System.out.print(" %");
                }
            } else {
                for (int j = 0; j < 4; j++) {
                    System.out.print("% ");
                }
            }
            System.out.println();
        }*/


    }
}
