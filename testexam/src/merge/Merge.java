package merge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Merge {
  public static void main(String[] args) {
    List<String> list1= new ArrayList<>(Arrays.asList("apple", "pear", "banana", "orange"));
    List<String> list2= new ArrayList<>(Arrays.asList("dog", "cat"));
    System.out.println(mergeElements(list1,list2));

  }
  public static List<String> mergeElements(List<String> list1,List<String> list2){
    List<String>mergedList=new ArrayList<>();
    int counter=Math.min(list1.size(),list2.size());
    for (int i = 0; i < counter; i++) {
      mergedList.add(list1.get(i));
      mergedList.add(list2.get(i));
    }
    if (list1.size()>list2.size()){
      mergedList.addAll(list1.subList(counter,list1.size()));
    } else {
      mergedList.addAll(list2.subList(counter,list2.size()));
    }
    return mergedList;
  }
}
