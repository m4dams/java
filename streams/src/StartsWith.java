import java.util.Arrays;
import java.util.List;

public class StartsWith {
  public static void main(String[] args) {
    List<String> cities = Arrays.asList
        ("ROME", "LONDON", "NAIROBI", "CALIFORNIA", "ZURICH",
            "NEW DELHI", "AMSTERDAM", "ABU DHABI", "PARIS");
    String condition = "A";
    cities.stream()
        .filter(string -> string.startsWith(condition))
        .forEach(System.out::println);

  }
}
