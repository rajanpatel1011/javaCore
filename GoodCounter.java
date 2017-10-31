public class GoodCounter extends java.applet.Applet implements Runnable {
   java.awt.Font theFont = new java.awt.Font("TimesRoman",java.awt.Font.BOLD,24);
   int theCounter = 0;
   Thread myThread;
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
}