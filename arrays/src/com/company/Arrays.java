package com.company;

public class Arrays {

    public static void main(String[] args) {
        // write your code here
        //Harmadik
        /*int[] numbers = {4, 5, 6, 7};
        System.out.println(numbers[2]);*/

        //HosszÖsszehasonlítás
        /*int[] firstArrayOfNumbers = {1, 2, 3};
        int[] secondArrayOfNumbers = {4, 5};
        if (secondArrayOfNumbers.length > firstArrayOfNumbers.length) {
            System.out.println("A secondArrayOfNumbers hosszabb");
        } else {
            System.out.println("A firstArrayOfNumbers hosszabb");
        }*/

        //ElemekÖsszege
        /*int[] numbers = {54, 23, 66, 12};
        System.out.println(numbers[1] + numbers[2]);*/

        //ElemVáltoztatás
        /*int[] numbers = {1, 2, 3, 8, 5, 6};
        numbers[3] = 4;
        System.out.println(numbers[3]);*/

        //ElemÉrtékemelés
        /*int[] numbers = {1, 2, 3, 4, 5};
        numbers[2] += 1;
        System.out.println(numbers[2]);*/

        //ElemekKiírása
        /*int[] numbers = {4, 5, 6, 7};
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }*/

        //Mátrix
        /*int matrixSize = 4;
        int[][] matrix = new int[matrixSize][matrixSize];
        for (int i = 0; i < matrixSize; i++) {
            for (int j = 0; j < matrixSize; j++) {
                if (j == i) {
                    matrix[i][j] = 1;

                }
                System.out.print(matrix[i][j] + " ");

            }
            System.out.println();
        }*/

        //ElemekÉrtékénekDuplázása
        /*int[] numlist = {3, 4, 5, 6, 7};
        for (int i = 0; i < numlist.length; i++) {
            numlist[i] *= 2;
            System.out.print(numlist[i] + " ");
        }*/

        //Colors
        /*String[][] colors = {
                {"lime", "forest green", "olive", "pale green", "spring green"},
                {"orange red", "red", "tomato"},
                {"orchid", "violet", "pink", "hot pink"}};*/

        //AddingAnA
        /*String[] animals = {"koal", "pand", "zebr"};
        for (int i = 0; i < animals.length; i++) {
            animals[i] += "a";
            System.out.println(animals[i]);
        }*/

        //SwitchingElements
        /*String[] orders = {"first", "second", "third"};
        String temp = orders[0];
        orders[0] = orders[2];
        orders[2] = temp;*/

        //MindenElemÖsszege
        /*int[] numbers = {3, 4, 5, 6, 7};
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];

        }
        System.out.println(sum);*/

        //Backwards
        int[] numbers = {4, 5, 6, 7};
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.println(numbers[i]);
        }


    }


}
