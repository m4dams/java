package com.company;

import java.util.List;

public class ReversedLines {
  public static void main(String[] args) {
    List<String> lines = Births.readFile("reversedlines.txt");

    for (String line : lines) {
      System.out.println(new StringBuilder(line).reverse());
    }

  }
}
