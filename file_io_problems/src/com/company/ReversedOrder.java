package com.company;


import java.util.Collections;
import java.util.List;

public class ReversedOrder {
  public static void main(String[] args) {
    List<String> lines = Births.readFile("reversedorder.txt");
    Collections.reverse(lines);
    lines.forEach(System.out::println);


  }
}


