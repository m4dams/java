import java.util.ArrayList;
import java.util.Collections;

public class ListIntroduction2 {
  public static void main(String[] args) {
    ArrayList<String> listA =new ArrayList<>();
    Collections.addAll(listA,"Apple", "Avocado", "Blueberries", "Durian", "Lychee");
    ArrayList<String> listB= new ArrayList<>();
    listB.addAll(listA);
    System.out.println(listA.contains("Durian"));
    listB.remove("Durian");
    listA.add(4,"Kivifruit");
    System.out.println(listA);
    System.out.println(listA.equals(listB));
    System.out.println(listA.indexOf("Avocado"));
    System.out.println(listB.indexOf("Durian"));
    Collections.addAll(listB,"Passion fruit", "Pomelo");
    System.out.println(listA.get(2));
  }
}
