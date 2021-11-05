import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;

public class PhoneBook {
  public static void main(String[] args) {
    Map<String, String> phoneBook = new HashMap<>();
    phoneBook.put("William A. Lathan", "405-709-1865");
    phoneBook.put("John K. Miller", "402-247-8568");
    phoneBook.put("Hortensia E. Foster", "606-481-6467");
    phoneBook.put("Amanda D. Newland", "307-687-2982");
    //phoneBook.put("Amanda D. Newland","319-243-56139");
    phoneBook.put("Brooke P. Askew", "307-687-2982");
    System.out.println(phoneBook.get("John K. Miller"));
//    for (String s : phoneBook.keySet()) {
//      if (phoneBook.get(s)=="307-687-2982"){
//        System.out.println(s);
//      }
//    }
    System.out.println(giveMeMyKey(phoneBook, "307-687-2982"));
//    System.out.println(giveMeMyKey(phoneBook, "307-687-2982"));
    System.out.println(phoneBook.containsKey("Chris E. Myer"));

  }

  public static Set<String> giveMeMyKey(
      Map<String, String> map, String value) {

    return map
        .entrySet()
        .stream()
        .filter(entry -> Objects.equals(entry.getValue(), value))
        .map(Map.Entry::getKey)
        .collect(Collectors.toSet());
  }

  public static Set<String> giveMeMyKey(
      Map<String, Integer> map, Integer value) {

    return map
        .entrySet()
        .stream()
        .filter(entry -> Objects.equals(entry.getValue(), value))
        .map(Map.Entry::getKey)
        .collect(Collectors.toSet());
  }
}
