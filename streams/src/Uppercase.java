import java.util.stream.Collectors;

public class Uppercase {
  public static void main(String[] args) {
    String text = "sdAbcaLasMsaAa";
    String upperCase =
        text.chars()
            .filter(Character::isUpperCase)
            .mapToObj(c -> Character.toString((char) c))
            .collect(Collectors.joining());
    System.out.println(text);
    System.out.println(upperCase);

  }


}
