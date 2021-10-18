package com.company;

import java.util.ArrayList;
import java.text.*;

public class Introduction {
//HelloWorld => CodingHours

     public static void main(String[] args) {
          // Hello World
          /* System.out.println("Hello World!");*/

          //Hello Me
          /* System.out.println("Hello Adam!");*/

          //LipemLopom
          /* System.out.println("Lipem, lopom a szőlőt,\nelaludt az öreg csősz.\nFurkósbot a kezébe,\nvaskalap a fejébe.");*/

          //HelloOthers
        /* String[] classmates={"Zsolt","Gábor","Tamás"};
         for (int i = 0; i < classmates.length; i++) {
             System.out.println("Hello "+ classmates[i] +"!");
         }*/

          //Introduction >> had to import java.util.ArrayList
         /* ArrayList<Object> list = new ArrayList<>();
          list.add("Pataki Ádám");
          list.add(37);
          list.add(1.73);
          list.forEach(System.out::println);*/

          //Arithmetics >>still using ArrayList
          int[] numbers = {13, 22};
          String[] operations={"összege","különbsége","szorzata","hányadosa","osztás maradéka", "osztás egészrésze"};
          ArrayList<Object> sum = new ArrayList<>();
          sum.add(numbers[0] + numbers[1]);
          sum.add(numbers[0] - numbers[1]);
          sum.add(numbers[0] * numbers[1]);
          sum.add((double) numbers[1] / (double) numbers[0]);
          sum.add(numbers[1] % numbers[0]);
          sum.add(numbers[1] / numbers[0]);
          for (int i = 0; i< operations.length; i++) {
               if (i < 3) {
                    System.out.println(numbers[0] +" és "+ numbers[1] +" "+operations[i] +": " + sum.get(i));
               } else {
                    System.out.println(numbers[1] +" és "+ numbers[0] +" "+operations[i] +": " + sum.get(i));
               }
          }

         //Coding Hours
          /*// Egy átlagos Green Fox hallgató 6 órát kódol naponta
          // Egy félév hosszúsága 17 hét
          //
          int sum=6*5*17;

          // Írd ki, hány órát tölt kódolással egy hallgató egy félév során,
          // ha a hallgató csak hétköznap kódol
          System.out.println("Egy átlagos hallgató " + sum + " órát kódol egy félév során");
          // Írd ki, hogy a félév hány százalékát tölti a hallgató kódolással
          // ha az átlagos heti munkaidő 52 óra
          int avg=52*17;
          double endsum=(double)sum/(double)avg*100;
          DecimalFormat endsumf = new DecimalFormat("#.##");
          System.out.println("Ez az átlagos munkaidő " + endsumf.format(endsum)+"%-a.");*/
     }
}
