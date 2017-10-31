class Thread4
{
        public static void main (String[] a)
        {
                MyServerThread4[] t;
                t = new MyServerThread4[5];

                for (int x = 0; x < 5; x++)
                {
                        t[x] = new MyServerThread4();
                        t[x].setThreadID(x);
                        t[x].start();
                }

                //Increase the priority of thread 0;
                //1 = lowest priority, 10 = highest priority
                System.out.println("Current priority = " + t[0].getPriority());
                System.out.println("Setting priority to 8");
                t[0].setPriority(8);
        }
}

class MyServerThread4 extends Thread
{
        public void run()
        {
                for (int x = 0; x < 10000; x++)
                        System.out.println("[" + ThreadID + ":" + this.getPriority() + "] Counter = " + x);
        }

        public void setThreadID(int t)
        {
                ThreadID = t;
        }

        int ThreadID;
}

