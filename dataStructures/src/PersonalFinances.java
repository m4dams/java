import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PersonalFinances {
  public static void main(String[] args) {
    List<Integer> expenses= Arrays.asList(500, 1000, 1250, 175, 800, 120);
    double sum=expenses.stream().reduce(0, Integer::sum);
    System.out.println("Összegzés\n" +
        "Összes kiadás: "+ sum+"\n" +
        "Legnagyobb kiadás: "+Collections.max(expenses)+"\n" +
        "Legkisebb kiadás: "+Collections.min(expenses)+ "\n" +
        "Átlag kiadás: "+sum/ expenses.size());
  }
}
