package com.company;

import java.util.Scanner;

public class scannerInputAndConditionals {

    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        //Hello User
        /*System.out.println("Please input your username!");
        String user = scanner.nextLine();
        System.out.println("Welcome " + user + "!");*/

        //MileToKmConverter
        /*System.out.println("Mérföld => Km átváltás\n" +
                "Add meg a távolságot mérföldben!\n" +
                ">>>TIZEDESTÖRT MEGADÁSÁHOZ A , KARAKTERT HASZNÁLD<<<");
        double distanceInMiles = scanner.nextDouble();
        System.out.println("A megadott távolság km-re átváltva: " + (distanceInMiles * 1.609344));*/

        //AnimalsAndLegs
        /*System.out.println("A program két egész számot kér be SPACE-el elválasztva\n" +
                "Az első reprezentálja a baromfik, míg a második a négylábúak számát.\n" +
                "A program eredménynek az állatálomány lábainak számát adja vissza.\n" +
                "Jelen példában feltételezzük, hogy minden állat ép végtagok szempontjából.\n" +
                "Kérlek add meg a két értéket SPACE-el elválasztva!");
        String input = scanner.nextLine();
        String[] numbersIn = input.split(" ");
        System.out.println("Nos, hogy miket ki nem találnak egyesek...\n" +
                "Sebaj, itt az eredmény: " +
                ((Integer.valueOf(numbersIn[0]) * 2) + (Integer.valueOf(numbersIn[1]) * 4)));*/

        //AverageOfInput
        /*System.out.println("A program 5 egész számot kér be SPACE-el elválasztva\n" +
                "A program eredménynek a számok összegét és átlagát adja vissza.\n" +
                "Kérlek add meg az 5 értéket SPACE-el elválasztva!");
        String input = scanner.nextLine();
        String[] numbersIn = input.split(" ");
        int sum = 0;
        for (int i = 0; i < numbersIn.length; i++) {
            sum += Integer.valueOf(numbersIn[i]);
        }
        System.out.println("Összeg: " + sum + "\tÁtlag: "
                + sum / numbersIn.length);*/

        //OddEven
        /*System.out.println("A progi eldönti, hogy az általad megadott egész szám páros vagy páratlan!\n" +
                "Ugye milyen menő! Na pötyögd be azt a számot mielőtt elszáll a venti...");
        long number = scanner.nextLong();
        String oddEven = number % 2 == 0 ? "páros" : "páratlan";
        System.out.println("Ki gondolta volna, tényleg " + oddEven + "!");*/

        //OnTwoALot
        /*System.out.println("Nos,... Hát,... Izé,...\n" +
                "Adj meg egy számot aztán mondok vmit...");
        double number = scanner.nextInt();
        String iSay;
        if (number <= 0) {
            iSay = "Nem elég";
        } else if (number == 1) {
            iSay = "Egy";
        } else if (number == 2) {
            iSay = "Kettő";
        } else {
            iSay = "Túl sok";
        }
        System.out.println(iSay);*/

        //PrintBigger
        /*System.out.println("A program két számot kér be SPACE-el elválasztva\n" +
                "Megmondom melyik a nagyobb! Ugye milyen okos vagyok!\n" +
                "Ha tizedestörteket akarsz megadni, azt a . használatával teheted.\n" +
                "Kérlek add meg a két értéket SPACE-el elválasztva!");
        String input = scanner.nextLine();
        String[] numbersIn = input.split(" ");
        float result = (Float.parseFloat(numbersIn[0]) > Float.parseFloat(numbersIn[1]) ? Float.parseFloat(numbersIn[0]) : Float.parseFloat(numbersIn[1]));
        System.out.println("Nos, hogy miket ki nem találnak egyesek...\n" +
                "Sebaj, itt ez a nagyobb: " + result);

        //PartyIndicator
        System.out.println("Buli indikátor vagy mifene...\n" +
                "Add meg a résztvevő lányok és fiúk számát SPACE-el elválasztva!");
        String input = scanner.nextLine();
        String[] numbersIn = input.split(" ");
        String buliIndikátor;
        if (Integer.valueOf(numbersIn[0]) == Integer.valueOf(numbersIn[1])
                && ((Integer.valueOf(numbersIn[0]) + Integer.valueOf(numbersIn[1])) > 20)) {
            System.out.println("Ez a buli kitűnő!");
        } else if (Integer.valueOf(numbersIn[0]) != Integer.valueOf(numbersIn[1])
                && ((Integer.valueOf(numbersIn[0]) + Integer.valueOf(numbersIn[1])) > 20)) {
            System.out.println("Ez a buli egész jó!");
        } else if (Integer.valueOf(numbersIn[0]) == 0) {
            System.out.println("Virsli party");
        } else if ((Integer.valueOf(numbersIn[0]) + Integer.valueOf(numbersIn[1])) < 20) {
            System.out.println("Átlagos buli...");
        }*/

        //ConditionalVariableMutation
        /*double a = 24;
        int out = 0;
        // Ha a páros, növeld az out változó értékét 1-gyel
        out = (int) a % 2 == 0 ? (out + 1) : out;

        System.out.println(out);

        int b = 13;
        String out2 = "";
        // Ha b 10 és 20 között van, akkor az out2 legyen "Édes!"
        // Ha b kevesebb, mint 10, out2 legyen "Kevés!"
        // Ha b több, mint 20, out2 legyen "Sok!"
        if (10 <= b && b <= 20) {
            out2 = "Édes!";
        } else if (b < 10) {
            out2 = "Kevés!";
        } else out2 = "Sok!";

        System.out.println(out2);

        int c = 123;
        int credits = 100;
        boolean isBonus = false;
        // Ha credits legalább 50,
        // és isBonus hamis, c legyen csökkentve 2-vel
        // Ha credits kisebb, mint 50,
        // és isBonus hamis, c legyen csökkentve 1-gyel
        // Ha isBonus igaz, c ne változzon
        if (credits >= 50 && !isBonus) {
            c -= 2;
        } else if (credits < 50 && !isBonus) {
            c -= 1;
        } else if (isBonus) {
            c = c;
        }

        System.out.println(c);

        int d = 8;
        int time = 120;
        String out3 = "";
        // Ha d osztható 4-gyel
        // és a time nem több, mint 200
        // out3 legyen "check"
        // Ha time nagyobb, mint 200
        // out3 legyen "Az idő lejárt!"
        // különben out3 legyen "Fuss, Forest, Fuss!"
        if (d % 2 == 0 && time <= 200) {
            out3 = "check";
        } else if (time > 200) {
            out3 = "Az idő lejárt!";
        } else out3 = "Fuss, Forest, Fuss!";

        System.out.println(out3);*/

        //SubstringSearch
        System.out.println("Megadsz két szöveget. Megmondom, hogy az első tartalmazza-e a másodikat,\n" +
                "ha igen, akkor azt is, hogy hanyadik karaktertől\n" +
                "Szöveg amiben keresek:");

        String searchingIn = scanner.nextLine();
        System.out.println("Szöveg amit keresek:");
        String searchingFor = scanner.nextLine();
        System.out.println("ittvan ni: \n" +
                subStringSearch(searchingIn, searchingFor));


    }

     private static int subStringSearch(String input, String query) {
        if (input.contains(query)) {
            return input.indexOf(query);
        } else {
            return -1;
        }
    }
}
