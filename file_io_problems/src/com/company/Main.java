package com.company;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // write your code here
        //

        //Doubled
        /*try {
            Path filePath = Paths.get("./assets/doubled.txt");
            Path writePath =Paths.get("./assets/correctOut.txt");
            List<String> lines = Files.readAllLines(filePath);
            ArrayList<String> correctLines = new ArrayList<>();
            for (String line : lines) {
                String output = "";

                for (int i = 1; i < line.length(); i = i + 2) {

                    output += line.charAt(i);
                }
                correctLines.add(output);
            }
                if (Files.exists(writePath)){
                Files.delete(writePath);
            };
            Files.write(writePath,correctLines);
        } catch (Exception e) {
            System.out.println(e);
        }*/

        //ReversedLines
        /*try {
            Path filePath = Paths.get("./assets/reversedlines.txt");
            List<String> lines = Files.readAllLines(filePath);
            //Ez is műxik, de a másik szebb
            for (int i = 0; i < lines.size(); i++) {
                System.out.println(new StringBuilder(lines.get(i)).reverse());

            }
            for (String line : lines) {
                System.out.println(new StringBuilder(line).reverse());
            }
        } catch (Exception e) {
            System.out.println(e);
        }*/

        //ReversedOrder
        /*try {
            Path filePath = Paths.get("./assets/reversedorder.txt");
            List<String> lines = Files.readAllLines(filePath);
            Collections.reverse(lines);
            lines.forEach(System.out::println);
        } catch (Exception e) {
            System.out.println("Hoppá... fájlt nem sikerült beolvasni!");
        }*/

    }
}
