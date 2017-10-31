class Thread3
{
        public static void main (String[] a)
        {
                MyServerThread3[] t;
                t = new MyServerThread3[5];

                for (int x = 0; x < 5; x++)
                {
                        t[x] = new MyServerThread3();
                        t[x].setThreadID(x);
                        t[x].start();
                }
        }
}

class MyServerThread3 extends Thread
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

