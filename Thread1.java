class Thread1
{
        public static void main (String[] a)
        {
                MyServerThread t;
                t = new MyServerThread();
                t.start();
        }
}

class MyServerThread extends Thread
{
        public void run()
        {
                for (int x = 0; x < 10000; x++)
                        System.out.println("Counter = " + x);
        }
}
