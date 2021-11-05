import java.util.ArrayList;


public class ListIntroduction1 {
  public static void main(String[] args) {
    ArrayList<String> firstList = new ArrayList<>();
    System.out.println(firstList);
    firstList.add("William");
    System.out.println(firstList.isEmpty());
    firstList.add("John");
    firstList.add("Amanda");
    System.out.println(firstList.size());
    System.out.println(firstList.get(2));
    for (String s : firstList) {
      System.out.println(s);
    }
   firstList.remove(1);
    for (int i = firstList.size()-1; i >= 0; i--) {
      System.out.println(firstList.get(i));

    }
    firstList.clear();
  }
}
