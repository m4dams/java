package com.company;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class DoubledChars {
    public static void main(String[] args) {
        // write your code here

        //Doubled
        try {
            Path filePath = Paths.get("./assets/doubled.txt");
            Path writePath = Paths.get("./assets/correctOut.txt");
            List<String> lines = Files.readAllLines(filePath);
            ArrayList<String> correctLines = new ArrayList<>();
            for (String line : lines) {
                StringBuilder output = new StringBuilder();

                for (int i = 1; i < line.length(); i = i + 2) {

                    output.append(line.charAt(i));
                }
                correctLines.add(output.toString());
            }
            if (Files.exists(writePath)) {
                Files.delete(writePath);
            }
            Files.write(writePath, correctLines);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
