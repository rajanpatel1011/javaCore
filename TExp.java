class TExp {
   public static void main(String[] a) {
      System.out.println("Driver starting.");
      new Front().start();
      new Back().start();
      System.out.println("Driver done.");
   }
}
class Back extends Thread {
   Back() {setPriority(2);}
   public void run() {
      System.out.println("Back starting.");
      for (double i = 1;i<5000000;i++) {}
         // about 12 sec
      System.out.println("Back done.");
   }
}
class Front extends Thread {
   Front() {setPriority(7);}
   public void run() {
      System.out.println("Front starting.");
      try {sleep(6000);}
      catch (Exception e) {}
      System.out.println("Front done.");
   }
}
