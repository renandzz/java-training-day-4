import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Question5 {
  public static void main(String[] args)
  {
    System.out.println("5. Write a program that takes a whole number input from a user and determines whether it is prime. If the number is not prime, display the unique prime factors of the number. Remember that a prime number's factors are only 1 and the prime number itself. Every number that is not prime has a unique prime factorization. For example, consider the number 54. The prime factors of 54 are 2, 3, 3 and 3. When the values are multiplied together, the result is 54. For the number 54, the prime factors output should be 2 and 3. Use Sets as part of your solution.");
    Scanner reader = new Scanner(System.in);
    System.out.println("Enter a number: ");
    int n = reader.nextInt();

    System.out.println("Prime factors of that number is : " + getPrimefactors(n));
  }

  public static Set<Integer> getPrimefactors(int n){
    Set<Integer> primefactors = new HashSet<Integer>();

    for (int i = 2; i <= n ; i++) {
      if(n % i == 0) {
        primefactors.add(i);
        n /= i;
        i--;
      }
    }
    return primefactors;
  }
}
