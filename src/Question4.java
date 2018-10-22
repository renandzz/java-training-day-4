
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Question4 {
  public static void main(String[] args)
  {
    System.out.println("4. Write a program that reads an unspecified number of integers and finds the one that has the most occurrences. Your input ends when the input is 0. For example, if you entered2 3 40 3 5 4 –3 3 3 2 0, the number3 occurred most often. Please enter one number at a time. If not one but several numbers have the most occurrences, all of them should be reported. For example,since 9 and3 appear twice in the list9 30 3 9 3 2 4, both should be reported.");
    Scanner reader = new Scanner(System.in);  // Reading from System.in
    int n;
    int highest_occurence=0;
    HashMap<Integer,Integer> hm = new HashMap<>();

    System.out.println("Enter a number: ");
    n = reader.nextInt();
    hm.put(n, hm.getOrDefault(n,0) + 1);
    highest_occurence =1;

    while (n != 0){
      System.out.println("Enter a number: ");
      n = reader.nextInt();
      hm.put(n, hm.getOrDefault(n,0) + 1);
      if(hm.get(n) > highest_occurence){
        highest_occurence = hm.get(n);
      }
    }

    reader.close();

    System.out.println("The biggest occurence of number is :");
    //Traversing map
    for(Map.Entry<Integer, Integer> entry:hm.entrySet()){
      int key=entry.getKey();
      int value=entry.getValue();
      if(value == highest_occurence){
        System.out.println(key);
      }
    }
  }
}
