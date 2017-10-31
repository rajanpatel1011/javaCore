class Long2
{
        public static void main(String[] Args)
        {
                long MyLong;
                int MyInt;
                short MyShort;
                byte MyByte;

                MyLong = 5000000000L; //Note that Java does not accept commas as in 30,000
                System.out.println("MyLong = " + MyLong);
                System.out.println();

                MyInt = 100000;
                MyLong = (long)MyInt;
                System.out.println("MyInt = " + MyInt);
                System.out.println("MyLong = " + MyLong);
                System.out.println();

                MyShort = 300;
                MyLong = (long)MyShort;
                System.out.println("MyShort = " + MyShort);
                System.out.println("MyLong = " + MyLong);
                System.out.println();

                MyByte = 100;
                MyLong = (long)MyByte;
                System.out.println("MyByte = " + MyByte);
                System.out.println("MyLong = " + MyLong);
        }
}
