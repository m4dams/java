import java.util.Arrays;
import java.util.List;

public class GroceryList {
  public static void main(String[] args) {
    List<String> groceryList = Arrays.asList("tojás", "tej", "hal", "alma", "kenyér", "csirke");
    System.out.println("Van tej a listán: "+groceryList.contains("tej"));
    System.out.println("Van banán a listán: "+groceryList.contains("banán"));
  }
}
