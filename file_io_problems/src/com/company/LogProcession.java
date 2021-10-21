package com.company;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
//shit aint working right yet

public class LogProcession {
   static final String IPADDRESS_PATTERN =
            "(?:(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)";

    public static void main(String[] args)  {
        try {
            Path filePath = Paths.get("./assets/logs.txt");
            List<String> lines = Files.readAllLines(filePath);
            ipListUniques(lines);
            System.out.println(relationOfPostAndGet(lines));

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static void ipListUniques(List<String> listname) {
        List<String> ipList = new ArrayList<>();


        for (String s : listname) {


            Pattern pattern = Pattern.compile(IPADDRESS_PATTERN);
            Matcher matcher = pattern.matcher(s);
            while (matcher.find()) {
                ipList.add(matcher.group());

            }
        }
        Set<String> ipSet = new LinkedHashSet<>(ipList);
        String[] ipArray = ipSet.toArray(new String[0]);
        for (String s : ipArray) {
            System.out.println(s);
        }
    }

    static double relationOfPostAndGet(List<String> listname) {
        int getNumber = 0;
        for (String s : listname) {
            Pattern pattern = Pattern.compile(".?GET");
            Matcher matcher = pattern.matcher(s);
            while (matcher.find()) {
                getNumber++;
            }

        }
        int postNumber = 0;
        for (String s : listname) {
            Pattern pattern = Pattern.compile(".?POST");
            Matcher matcher = pattern.matcher(s);
            while (matcher.find()) {
                postNumber++;
            }
        }
//        System.out.println("get: " + getNumber + "\tpost: " + postNumber);
        return ((double) getNumber / postNumber);
    }

}