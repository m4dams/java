package com.company;

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

//works...
public class Lottery {
    static final String LOTTERY_PATTERN = "[0-9][0-9]?;[0-9][0-9]?;[0-9][0-9]?;[0-9][0-9]?;[0-9][0-9]?";

    public static void main(String[] args) {
        try {
            Path filePath = Paths.get("./assets/lottery.csv");
            List<String> lines = Files.readAllLines(filePath);
            findFiveMostFrequent(lines);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static void findFiveMostFrequent(List<String> listName) {
        List<String> numbersList = new ArrayList<>();
        for (String s : listName) {

            Pattern pattern = Pattern.compile(LOTTERY_PATTERN);
            Matcher matcher = pattern.matcher(s);
            while (matcher.find()) {
                numbersList.addAll(Pattern.compile(";")
                        .splitAsStream(matcher.group())
                        .collect(Collectors.toList()));
            }
        }
//        Collects elements and maps them to their frequency
        Map<String, Long> map = numbersList.stream()
                .collect(Collectors.groupingBy(w -> w, Collectors.counting()));
//      Sorts Map entries,limits stream to keep only 5 elements, collects those into list
//      Use .naturalOrder() for least frequent numbers
        List<Map.Entry<String, Long>> result = map.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .limit(5)
                .collect(Collectors.toList());

        System.out.println(result);

    }
}
