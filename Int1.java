class Int1
{
        public static void main(String[] Args)
        {
                int MyInt;
                short MyShort;
                byte MyByte;

                MyInt = 100000; //Note that Java does not accept commas as in 30,000
                System.out.println("MyInt = " + MyInt);
                System.out.println();

                MyShort = 30000;
                MyInt = (int)MyShort;
                System.out.println("MyShort = " + MyShort);
                System.out.println("MyInt = " + MyInt);
                System.out.println();

                MyByte = 100;
                MyInt = (int)MyByte;
                System.out.println("MyByte = " + MyByte);
                System.out.println("MyInt = " + MyInt);
        }
}
