import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ProductList {
  public static void main(String[] args) {
    Map<String, Integer> productList = Stream.of(new Object[][] {
        {"Eggs", 200},
        {"Milk", 200},
        {"Fish", 400},
        {"Apples", 150},
        {"Bread", 50},
        {"Chicken", 550}
    }).collect(Collectors.toMap(data -> (String) data[0], data -> (Integer) data[1]));
    System.out.println("Price of fish: " + productList.get("Fish"));
    int maxPrice = 0;
    String mostExpensive = "";
    for (String s : productList.keySet()) {
      if (maxPrice < productList.get(s)) {
        maxPrice = productList.get(s);
        mostExpensive = s;
      }
    }
    System.out.println("Most expensive product: " + mostExpensive + "\t" + maxPrice);
    int sum = 0;
    for (String s : productList.keySet()) {
      sum += productList.get(s);
    }
    System.out.println("Avg. price of products: " + sum / productList.size());
    List<String> belowThreehundered = new ArrayList<>();
    for (String s : productList.keySet()) {
      if (productList.get(s) < 300) {
        belowThreehundered.add(s);
      }
    }
    System.out.println("How many products are priced below 300? " + belowThreehundered.size());

  }
}
