import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Top100MostUsedWords {
  public static void main(String[] args) {
    Predicate<String> alphaNumaricFilter = Pattern.compile("[a-zA-Z0-9]+").asPredicate();
    String filePath = new File("").getAbsolutePath() +
        "\\assets\\wiki.txt";

    List<String> list = new ArrayList<>();
    try (Stream<String> stream = Files.lines(Paths.get(filePath))) {

      list = stream.map(s -> s.split(" ")).flatMap(Stream::of).collect(Collectors.toList());

    } catch (IOException e) {
      e.printStackTrace();
    }
    Map<String, Long> map = list.stream()
        .filter(s -> s.matches("[a-zA-Z0-9]+"))
        .collect(Collectors.groupingBy(w -> w, Collectors.counting()));
    List<Map.Entry<String, Long>> result = map.entrySet().stream()
        .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
        .limit(100)
        .collect(Collectors.toList());
    System.out.println(result);
  }
}
