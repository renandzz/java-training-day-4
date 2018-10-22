import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class Question6 {
  public static void main(String[] args)
  {
    System.out.println("6. Write a program that uses a StringTokenizer to tokenize a line of text input by the user and places each token in a treeSet. Print the elements of the treeSet. [Note: This should cause the elements to be printed in ascending sorted order.");

    Scanner reader = new Scanner(System.in);
    System.out.println("Enter a text input: ");
    String n = reader.nextLine();

    TreeSet<String> token = new TreeSet<>();
    StringTokenizer st = new StringTokenizer(n);
    while (st.hasMoreTokens()){
      token.add(st.nextToken());
    }

    System.out.println(token);
  }
}
