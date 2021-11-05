import java.util.HashMap;

public class MapIntroduction1 {
  public static void main(String[] args) {
    HashMap<Integer, Character> firstMap = new HashMap<>();
    System.out.println(firstMap.isEmpty());
    firstMap.put(97, 'a');
    firstMap.put(98, 'b');
    firstMap.put(99, 'c');
    firstMap.put(65, 'A');
    firstMap.put(66, 'B');
    firstMap.put(67, 'C');
    System.out.println(firstMap.keySet());
    for (Character value : firstMap.values()) {
      System.out.println(value);
    }
    firstMap.put(68, 'D');
    System.out.println(firstMap.size());
    System.out.println(firstMap.get(99));
    firstMap.remove(97);
    System.out.println(firstMap.containsKey(100));
    firstMap.clear();
  }
}
