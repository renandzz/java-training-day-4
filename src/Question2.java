import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.TreeSet;

public class Question2 {
  public static void main(String[] args)
  {
    System.out.println("2. Write a program that reads words from a text file and displays all the nonduplicate words in ascending order.");
    File file1 = new File("/Users/rheist/Documents/GitHub/java-training-day-4/src/api.txt");
    TreeSet<String> catalog = new TreeSet<>();
    int exist;

    try {
      BufferedReader in = (new BufferedReader(new FileReader(file1)));
      String strLine;
      while ((strLine = in.readLine())!= null){
        String[] words = strLine.split(" ");
        for (String s: words) {
          exist = 0;
          for (String c: catalog) {
            if(c == s) {
              exist=1;
            }
          }
          if(exist == 0){
            catalog.add(s);
          }
        }
      }

      in.close();

      System.out.println(catalog.toString());
    } catch (IOException e) {
      System.out.println(e.toString());
    }
  }
}
