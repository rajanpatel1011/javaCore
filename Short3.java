class Short3
{
        public static void main(String[] Args)
        {
                short MyShort;
                int MyInt;

                MyInt = 100;

                MyShort = (short)MyInt;
                System.out.println("MyShort = " + MyShort);
                System.out.println("It's ok to assign variables of different types as long as you let the compiler know that you are doing this intentionally by casting its type.");
        }
}
