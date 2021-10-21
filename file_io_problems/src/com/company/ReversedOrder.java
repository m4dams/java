package com.company;


import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.List;

public class ReversedOrder {
    public static void main(String[] args) {


        //ReversedOrder
        try {
            Path filePath = Paths.get("./assets/reversedorder.txt");
            List<String> lines = Files.readAllLines(filePath);
            Collections.reverse(lines);
            lines.forEach(System.out::println);
        } catch (Exception e) {

            System.out.println("Hoppá... fájlt nem sikerült beolvasni!");
            e.printStackTrace();
        }

    }
}


