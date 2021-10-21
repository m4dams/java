package com.company;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class ReversedLines {
    public static void main(String[] args) {
        try {
            Path filePath = Paths.get("./assets/reversedlines.txt");
            List<String> lines = Files.readAllLines(filePath);
//            Ez is műxik, de a másik szebb
//            for (int i = 0; i < lines.size(); i++) {
//                System.out.println(new StringBuilder(lines.get(i)).reverse());
//
//            }
            for (String line : lines) {
                System.out.println(new StringBuilder(line).reverse());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
