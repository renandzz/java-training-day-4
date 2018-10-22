public class LovesMeNotThread extends Thread {
  public void run()
  {
    for (int i = 1; i < 1000 ; i++) {
      System.out.println("Loves Me Not!");
    }

  }
}
