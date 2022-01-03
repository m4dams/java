import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MapCharacterToFrequency {
  public static void main(String[] args) {
    String text="Bacon ipsum dolor amet pork chop ground round hamburger beef ribs" +
        " shank picanha kevin drumstick leberkas sausage biltong. Shoulder doner bacon" +
        " porchetta beef ribs, shankle frankfurter ribeye kevin turducken landjaeger jowl " +
        "beef andouille venison. Buffalo cow salami beef ribs turkey beef sirloin. Bresaola" +
        " burgdoggen ham hock prosciutto pork tongue.";
    Map<Character, Long> frequency =
        text.chars()
            .mapToObj(c -> (char)c)
            .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
    System.out.println(frequency);
  }
}
