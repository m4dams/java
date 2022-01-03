import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FoxSearch {
  public static void main(String[] args) {
    List<Fox> foxList = Arrays.asList(
        new Fox("fox1", "green", 3),
        new Fox("fox2", "white", 7),
        new Fox("fox3", "brown", 1),
        new Fox("fox4", "green", 7),
        new Fox("fox5", "purple, don't ask", 9));

    foxList.stream()
        .filter(fox -> fox.color.equals("green"))
        .forEach(System.out::println);

    foxList.stream()
        .filter(fox -> fox.color.equals("green") && fox.age < 5)
        .forEach(System.out::println);

    Map<String, Long> frequency =
        foxList.stream()
            .map(fox -> fox.color)
            .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
    System.out.println(frequency);

  }

}

class Fox {
  String name;
  String color;
  int age;

  public Fox(String name, String color, int age) {
    this.name = name;
    this.color = color;
    this.age = age;
  }

  @Override
  public String toString() {
    return "Fox{" +
        "name='" + name + '\'' +
        ", color='" + color + '\'' +
        ", age=" + age +
        '}';
  }
}
