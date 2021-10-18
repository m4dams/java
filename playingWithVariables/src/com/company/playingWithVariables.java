package com.company;

import java.text.DecimalFormat;

public class playingWithVariables {

    public static void main(String[] args) {
        // write your code here
        //Favorite Number
        /*int favoriteNumber = 13;
        System.out.println("A kedvenc számom: " + favoriteNumber);*/

        //Swap Variables
        /*int a = 123;
        int b = 456;

        System.out.println("a: " + a + "\tb: " + b);
        int c = a;
        a = b;
        b = c;
        System.out.println("a: " + a + "\tb: " + b);*/

        //BMI
        double massInKg = 81.2;
        double heightInM = 1.78;
        double bodyMassIndex = massInKg / (heightInM * heightInM);
        DecimalFormat bodyMassIndexF = new DecimalFormat("#.##");
        System.out.println("Bmi a következő adatokkal:\n" +
                "Tömeg kg-ban: " + massInKg + " kg\n" +
                "Magasság m-ben: " + heightInM + " m\n" +
                "Testtömegindex: " + bodyMassIndexF.format(bodyMassIndex));

        //BasicInfo
        /*String name = "Pataki Ádám";
        int age = 37;
        double height = 1.75;
        boolean married = false;
        System.out.println("Név: " + name + "\n" +
                "Kor: " + age + " év\n" +
                "Magasság: " + height + " m\n" +
                "Házas: " + married);*/

        //Variable Mutation
        /*int a = 3;
        a += 10;
        System.out.println("a: 3\t new a: " + a);
        int b = 100;
        b -= 7;
        System.out.println("b: 100\t new b: " + b);
        int c = 44;
        c *= 2;
        System.out.println("c: 44\t new c: " + c);
        int d = 125;
        d /= 5;
        System.out.println("d: 125\t new d: " + d);
        int e = 8;
        e = (int) Math.pow(e, 3);
        System.out.println("e: 8\t new e: " + e);
        int f1 = 123;
        int f2 = 345;
        boolean x = f1 > f2;
        System.out.println("Számok:\n" +
                "f1: " + f1 + "\tf2: " + f2 + "\n" +
                "f1 nagyobb f2-nél? " + x);
        int g1 = 350;
        int g2 = 200;
        x = (g2 * g2) > g1;
        System.out.println("Számok:\n" +
                "g1: " + g1 + "\tg2: " + g2 + "\n" +
                "g2 kétszerese nagyobb g1-nél? " + x);
        int h = 135798745;
        x = h % 11 == 0;
        System.out.println("Számok:\n" +
                "h: " + h + "\n" +
                "osztható h maradék nélkül 11-el? " + x);
        int i1 = 10;
        int i2 = 3;
        x = i1 > (i2 * i2) && i1 < (int) Math.pow(i2, 3);
        System.out.println("Számok:\n" +
                "i1: " + i1 + "\ti2: " + i2 + "\n" +
                "i1 nagyobb-e i2 négyzeténél ÉS ugyanakkor kisebb-e i2 köbénél? " + x);
        int j = 1521;
        x = (j % 3 == 0) || (j % 5 == 0);
        System.out.println("Számok:\n" +
                "j: " + j + "\n" +
                "j osztható-e 3-mal vagy 5-tel? " + x);*/

        //Cuboid
        //dimensions[] is filled with data starting from index 0 like this: width,length,height
        /*double[] dimensions = {2.45, 3.27, 1.83};
        DecimalFormat dimF = new DecimalFormat("#.##");
        System.out.println("Szélesség: " + dimensions[0] + "\tHosszúság: " + dimensions[1] + "\tMagasság: " + dimensions[2]);
        System.out.println("Felület: " + dimF.format(2 * (dimensions[0] * dimensions[1] + dimensions[1] * dimensions[2] + dimensions[0] * dimensions[2])));
        System.out.println("Térfogat: " + dimF.format(dimensions[0] * dimensions[1] * dimensions[2]));

        //SecondsInADay
        int currentHours = 14;
        int currentMinutes = 34;
        int currentSeconds = 42;
        int totalSeconds = 24 * 3600;
        System.out.println("Ennyi másodperc van mé hátra a napból: " + (totalSeconds - (currentHours * 3600 + currentMinutes * 60 + currentSeconds)));*/
    }
}
