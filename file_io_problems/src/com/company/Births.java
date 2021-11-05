package com.company;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Births {

  public static void main(String[] args) {
    System.out.println(mostBirthsInYear("births.csv"));
  }

  public static String mostBirthsInYear(String filename) {
    ArrayList<String> sourceFile = (ArrayList<String>) readFile(filename);
    ArrayList<String> listOfYears = new ArrayList<>();
    for (String s : sourceFile) {
      Pattern pattern = Pattern.compile("[1-9][0-9][0-9][0-9]");
      Matcher matcher = pattern.matcher(s);
      while (matcher.find()) {
        listOfYears.add(matcher.group());
      }
    }
    Map<String, Long> map = listOfYears.stream()
        .collect(Collectors.groupingBy(w -> w, Collectors.counting()));
    List<Map.Entry<String, Long>> sortedYears = map.entrySet().stream()
        .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
        .collect(Collectors.toList());

    return sortedYears.get(0).getKey();
  }

  public static List<String> readFile(String fileName) {
    List<String> fileContent = new ArrayList<>();
    Path path = Paths.get("./assets/" + fileName);

    try {
      fileContent = Files.readAllLines(path);
    } catch (IOException e) {
      System.out.println("Error: unable to read file");
    }

    return fileContent;
  }
}
