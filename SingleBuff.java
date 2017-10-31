public class SingleBuff extends java.applet.Applet implements Runnable 
{
   final int xOvalSize = 100, yOvalSize = 100;   
   final int dx = 2, dy = 2;
   final int updateInt = 10;  // Milliseconds
   // Note:  "Cor" is short for "Corner"
   protected int xCorFrameSize, yCorFrameSize;
   protected int xOvalCor = 0, yOvalCor = 0;
   protected int xDir = 1, yDir  = 1;
   protected Thread   myThread;
   public void start() {
      if (myThread == null) {
         myThread = new Thread(this);
         myThread.start();
      }
   }
   public void stop() {
      if (myThread != null) {
         myThread.stop();
         myThread = null;
      }
   }
   public void run() {
      while (true) {
         xCorFrameSize = size().width -xOvalSize;
         yCorFrameSize = size().height-yOvalSize;
         xOvalCor = Math.min(xOvalCor,xCorFrameSize);
         yOvalCor = Math.min(yOvalCor, yCorFrameSize);
         try {
             Thread.sleep(updateInt);
         }  catch(InterruptedException ie) {
             System.out.println("Whoops");
         }
         xOvalCor += dx*xDir;
         yOvalCor += dy*yDir;

       if (xOvalCor <= 0 || xOvalCor >= xCorFrameSize) { xDir *= -1; }
       if (yOvalCor <= 0 || yOvalCor >= yCorFrameSize) { yDir *= -1; }
       this.repaint();
     }
   }
   public void paint(java.awt.Graphics gr) {
      gr.setColor(java.awt.Color.red);
      gr.fillOval(xOvalCor, yOvalCor, xOvalSize, yOvalSize);
   }
}
