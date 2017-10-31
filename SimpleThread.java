class SimpleThread extends Thread {
	private int delayInMs;
	SimpleThread(String name, int delayInMs) {
	   super(name);
	   this.delayInMs = delayInMs;
       }
	public void run() {
	   while (true) {
              try {
	         sleep(delayInMs);
              } catch (InterruptedException e) {
	         e.printStackTrace();
	      }
	      System.out.println(getName()); 
	   }
        }
      public static void main(String[] arg) {
        SimpleThread whole = new SimpleThread("whole", 1000);
        SimpleThread half =  new SimpleThread("half",   500);
        SimpleThread third = new SimpleThread("third",  333);
        whole.start();
        half.start();
        third.start();
    }
}
