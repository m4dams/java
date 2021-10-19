package com.company;



import java.util.Scanner;


public class FunFunFunctions {

    public static void main(String[] args) {
        // write your code here
        //Doubling
        int baseNum = 123;
        doubling(baseNum);
        //System.out.println(subInt(2,new int[]{3,2,2,5,4}));

    }

    //Doubling
    static int doubling(int numberIn) {
        return (numberIn * 2);
    }



}




//Sum


//Faktoriális
class Factorio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Melyik szám faktoriálisát szeretnéd?");
        int number = scanner.nextInt();
        System.out.println(factorio(number));
    }

    public static int factorio(int input) {
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
}

