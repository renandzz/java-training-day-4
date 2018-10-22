public class MyThread extends Thread{
  TheInteger theInteger;

  public MyThread(TheInteger theInteger) {
    this.theInteger = theInteger;
  }

  public void run()
  {
      System.out.println(theInteger.getSum());
      theInteger.addSum();
  }
}
