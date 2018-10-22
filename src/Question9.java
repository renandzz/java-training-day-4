public class Question9 {
  Integer sum =0;

  public static void main(String[] args){
    System.out.println("9. Write a program that launches one thousand threads. Each thread adds 1 to variable sum that initially is zero. You need to pass sum by reference to each thread. In order to pass it by reference, define an Integer wrapper object to hold sum. Run the program with and without synchronization to see its effect.");
    Question9 mt = new Question9();
    TheInteger theinteger = new TheInteger();


    for (int i = 0; i < 1000 ; i++) {
       MyThread thread = new MyThread(theinteger);
       thread.start();
    }

  }
}
