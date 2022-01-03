import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class Concat {
  public static void main(String[] args) {
    String text = "something to add to, ";
    List<Character> addition = Arrays
        .asList('a', 'n', 'd', ' ', 's', 'o', 'm','e', 't', 'h', 'i', 'n', 'g', ' ', 'a', 'd', 'd', 'e',
            'd');
    String combined =
        IntStream.concat(text.chars(),
                addition.stream().mapToInt(Character::charValue))
            .collect(StringBuilder::new,
                StringBuilder::appendCodePoint,
                StringBuilder::append)
            .toString();
    System.out.println(combined);

  }
}
