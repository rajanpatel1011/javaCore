class Array1
{
        public static void main (String[] Args)
        {
                int[] MonthArray;

                MonthArray = new int[12];
                MonthArray[0] = 31;
                MonthArray[1] = 28;
                MonthArray[2] = 31;
                // ...

                System.out.println("The third month of the year has " + MonthArray[2] + " days in it.");
        }
}
