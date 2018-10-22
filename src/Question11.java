import java.applet.Applet;
import java.awt.Graphics;

public class Question11 extends Applet implements Runnable{
  int x,y;
  Thread Marquee = null;
  public void paint(Graphics g)
  {
    g.drawString("Hello World", x, y);
  }

  public void start(){
    if(Marquee == null){
      Marquee = new Thread(this);
      Marquee.start();
    }
  }

  @Override
  public void run() {
    while (true){
      x-=5;
      if(x==0){
        x = getSize().width;
      }
      repaint();
      try{
        Marquee.sleep(200);
      }catch (Exception E){

      }
    }
  }

  public void init(){
    x = getSize().width;
    y = getSize().height/2;
  }
}
