public class Counter1 extends java.applet.Applet implements Runnable 
{
   int theCounter = 0;
   Thread myThread;
   public void start() {
      myThread = new Thread(this);
      myThread.start();
   }
   public void run() {
      while (true) {
         theCounter++;
         repaint();
         try {Thread.sleep(1000);}
         catch (Throwable e) {
         	System.out.println("Got " + e);
         }
      } 
   }
    public void paint(java.awt.Graphics g) {
       g.drawString(Integer.toString(theCounter),10,50);
   }
}
