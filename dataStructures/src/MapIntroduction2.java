import java.util.HashMap;

public class MapIntroduction2 {
  public static void main(String[] args) {
    HashMap<String, String> secondMap = new HashMap<>();
    secondMap.put("978-1-60309-452-8", "A Letter to Jo");
    secondMap.put("978-1-60309-459-7", "Lupus");
    secondMap.put("978-1-60309-444-3", "Red Panda and Moon Bear");
    secondMap.put("978-1-60309-461-0", "The Lab");
    for (String s : secondMap.keySet()) {
      System.out.println(s + " " + secondMap.get(s));
    }
    secondMap.remove("978-1-60309-444-3");
    secondMap.entrySet().removeIf(e -> e.getValue().equals("The Lab"));
    secondMap.put("978-1-60309-450-4", "They Called Us Enemy");
    secondMap.put("978-1-60309-453-5", "Why Did We Trust Him?");
    System.out.println(secondMap.containsKey("478-0-61159-424-8"));
    System.out.println(secondMap.get("978-1-60309-453-5"));
  }
}
