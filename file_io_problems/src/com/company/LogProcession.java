package com.company;

import java.util.HashSet;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LogProcession {
  static final String IPADDRESS_PATTERN =
      "(?:(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)";

  public static void main(String[] args) {
    try {
      List<String> lines = Births.readFile("logs.txt");
      System.out.println(ipListUniques(lines));
      System.out.println(relationOfPostAndGet(lines));

    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  private static HashSet<String> ipListUniques(List<String> listname) {
    HashSet<String> ipList = new HashSet<>();
    for (String s : listname) {
      Pattern pattern = Pattern.compile(IPADDRESS_PATTERN);
      Matcher matcher = pattern.matcher(s);
      while (matcher.find()) {
        ipList.add(matcher.group());
      }
    }
    return ipList;
  }

  private static double relationOfPostAndGet(List<String> list) {
    int getNumber = countStuff(list, "GET");
    int postNumber = countStuff(list, "POST");
    return ((double) getNumber / postNumber);
  }

  private static int countStuff(List<String> list, String searchFor) {
    Pattern pattern = Pattern.compile(searchFor);
    int counter = 0;
    for (String s : list) {
      Matcher matcher = pattern.matcher(s);
      while (matcher.find()) {
        counter++;
      }
    }
    return counter;

  }
}