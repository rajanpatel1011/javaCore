class Thread5
{
        public static void main (String[] a)
        {
                MyServerThread5[] t;
                t = new MyServerThread5[5];

                for (int x = 0; x < 5; x++)
                {
                        t[x] = new MyServerThread5();
                        t[x].setThreadID(x);
                        t[x].start();
                }

                //Increase the priority of thread 0;
                //1 = lowest priority, 10 = highest priority
                System.out.println("Current priority = " + t[0].getPriority());
                System.out.println("Setting priority to 5");
                t[0].setPriority(1);

                while (t[1].getCount() < 25) {}
                t[1].stop();
                System.out.println("Thread 1 stopped by main program");
        }
}

class MyServerThread5 extends Thread
{
        public void run()
        {
                for (Count = 0; Count < 10000; Count++)
                        System.out.println("[" + ThreadID + ":" + this.getPriority() + "] Counter = " + Count);
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


