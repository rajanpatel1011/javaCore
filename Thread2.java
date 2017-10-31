class Thread2
{
        public static void main (String[] a)
        {
                MyServerThread2 t;
                t = new MyServerThread2();
                t.setThreadID(1);
                t.start();

                MyServerThread2 t2;
                t2 = new MyServerThread2();
                t2.setThreadID(2); 
                t2.start();
        }
}

class MyServerThread2 extends Thread
{
        public void run()
        {
                for (int x = 0; x < 10000; x++)
                        System.out.println("[" + ThreadID + "] Counter = " + x);
        }

        public void setThreadID(int t)
        {
                ThreadID = t;
        }

        int ThreadID;
}

