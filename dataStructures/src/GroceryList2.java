import java.util.HashMap;

public class GroceryList2 {
  public static void main(String[] args) {
    HashMap<String, Double> priceList = new HashMap<>();
    priceList.put("Tej", 1.07);
    priceList.put("Rizs", 1.59);
    priceList.put("Tojás", 3.14);
    priceList.put("Sajt", 12.60);
    priceList.put("Csirke", 9.40);
    priceList.put("Alma", 2.31);
    priceList.put("Paradicsom", 2.58);
    priceList.put("Krumpli", 1.75);
    priceList.put("Hagyma", 1.10);
    HashMap<String, Integer> bobList = new HashMap<>();
    bobList.put("Tej", 3);
    bobList.put("Rizs", 2);
    bobList.put("Tojás", 2);
    bobList.put("Sajt", 1);
    bobList.put("Csirke", 4);
    bobList.put("Alma", 1);
    bobList.put("Paradicsom", 2);
    bobList.put("Krumpli", 1);
    HashMap<String, Integer> aliceList = new HashMap<>();
    aliceList.put("Rizs", 1);
    aliceList.put("Tojás", 5);
    aliceList.put("Csirke", 2);
    aliceList.put("Alma", 1);
    aliceList.put("Paradicsom", 10);
    double sumBob = 0;
    double sumAlice = 0;
    for (String s : priceList.keySet()) {
      if (aliceList.containsKey(s)) {
        sumAlice += priceList.get(s) * aliceList.get(s);
      }
      if (bobList.containsKey(s)) {
        sumBob += priceList.get(s) * bobList.get(s);
      }

    }
    System.out.println("Alice total: " + sumAlice + "\tBob total: " + sumBob);
    System.out.println("Who bought more rice? " + boughtMore(aliceList, bobList, "Rizs"));
    System.out.println("Who bought more potatos? " + boughtMore(aliceList, bobList, "Krumpli"));
    String boughtMoreProduct = (aliceList.size() > bobList.size()) ? "Alice" : "Bob";
    System.out.println("Who bought more type of products? " + boughtMoreProduct);
    sumAlice = 0;
    sumBob = 0;
    for (String s : priceList.keySet()) {

      if (aliceList.containsKey(s)) {
        sumAlice += aliceList.get(s);
      }
      if (bobList.containsKey(s)) {
        sumBob += bobList.get(s);
      }

    }
    boughtMoreProduct = (sumAlice > sumBob) ? "Alice" : "Bob";
    System.out.println("Who bought more products? " + boughtMoreProduct);
  }

  private static String boughtMore(HashMap<String, Integer> aliceList,
                                   HashMap<String, Integer> bobList,
                                   String moreWhatever) {
    String boughtMore = "";
    if (aliceList.containsKey(moreWhatever) && !bobList.containsKey(moreWhatever)) {
      boughtMore = "Alice";
    } else if (bobList.containsKey(moreWhatever) && !aliceList.containsKey(moreWhatever)) {
      boughtMore = "Bob";
    } else {
      boughtMore = (aliceList.get(moreWhatever) > bobList.get(moreWhatever)) ? "Alice" : "Bob";
    }
    return boughtMore;
  }

}
