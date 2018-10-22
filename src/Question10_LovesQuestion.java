public class Question10_LovesQuestion {
  public static void main(String[] args){
    System.out.println("10. Create two classes that extend Thread—LovesMeThread and LovesMeNotThread. Each Thread displays the phrase its name implies 1000 times.Write a program to start the two Threads; the final message is the answer to your question! Save the classes as LovesMeThread.java and LovesMeNotThread.java and the program as LoveQuestion.java.\n");
    LovesMeThread Love = new LovesMeThread();
    LovesMeNotThread NoLove = new LovesMeNotThread();
    Love.start();
    NoLove.start();
  }
}
