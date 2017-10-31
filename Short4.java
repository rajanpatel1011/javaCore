class Short4
{
        public static void main(String[] Args)
        {
                short MyShort;
                int MyByte;

                MyShort = 200;
                MyByte = (byte)MyShort;
                
                System.out.println("MyShort = " + MyShort);
                System.out.println("MyByte = " + MyByte);
                System.out.println("Although does not generate a compiler error, it may cause major problems when your program runs.");
        }
}
