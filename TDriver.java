public class TDriver {
   public static int x = 50;
   
   public static void main(String[] a) {
      new TA().start();
      new TB().start();
      System.out.println("TD " + x); 
      System.out.println("TD " + x); 
      System.out.println("TD " + x); 
      System.out.println("TD " + x); 
   }
}
class TA extends Thread {
   public void run() {
      System.out.println("TA " + TDriver.x); 
      TDriver.x += 10;
      System.out.println("TA " + TDriver.x); 
   }
}
class TB extends Thread {
   public void run() {
      System.out.println("TB " + TDriver.x); 
      TDriver.x += 1;
      System.out.println("TB " + TDriver.x); 
   }
}
