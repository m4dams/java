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
      List<String> lines = Births.readFile("doubled.txt");
      Path writePath = Paths.get("./assets/correctOut.txt");
      ArrayList<String> correctLines = reducer(lines);

      if (Files.exists(writePath)) {
        Files.delete(writePath);
      }
      Files.write(writePath, correctLines);
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  private static ArrayList<String> reducer(List<String> lines) {
    ArrayList<String> correctLines = new ArrayList<>();
    for (String line : lines) {
      StringBuilder output = new StringBuilder();

      for (int i = 1; i < line.length(); i = i + 2) {

        output.append(line.charAt(i));
      }
      correctLines.add(output.toString());
    }
    return correctLines;
  }
}
