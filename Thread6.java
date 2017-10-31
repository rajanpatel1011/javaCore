class Thread6
{
        public static void main (String[] a)
        {
                MyServerThread6[] t;
                t = new MyServerThread6[5];

                for (int x = 0; x < 5; x++)
                {
                        t[x] = new MyServerThread6();
                        t[x].setThreadID(x);
                        t[x].start();
                }

                //Increase the priority of thread 0;
                //1 = lowest priority, 10 = highest priority
                System.out.println("Current priority = " + t[0].getPriority());
                System.out.println("Setting priority to 5");
                t[0].setPriority(1);

                //Stop thread 1 when it gets to 25
                while (t[1].getCount() < 25) {}
                t[1].stop();
                System.out.println("Thread 1 stopped by main program");
                System.out.println("End of main program");
        }
}

class MyServerThread6 extends Thread
{
        public void run()
        {
                for (Count = 0; Count< 100; Count++)
                        System.out.println("[" + ThreadID + ":" + this.getPriority() + "] Counter = " + Count);
                stop();
        }

        public void setThreadID(int t)
        {
                ThreadID = t;
        }

        public int getCount()
        {
                return Count;                
        }

        int Count;
        int ThreadID;
}

