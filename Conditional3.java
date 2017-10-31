class Conditional3
{
        public static void main(String Args[])
        {
                //Note {} are optional for single line block
                //but required for multi-line block.

                int HourOfDay = 10; //Base 0

                if (HourOfDay < 12)
                        System.out.println("AM");
                else if (HourOfDay < 24)
                {
                        System.out.println("PM");
                }
                else
                {
                        System.out.println("" + HourOfDay + " is not a legal value.");
                        System.out.println("Please try a number between 0 and 23.");
                }

                HourOfDay = 15;
                if (HourOfDay < 12)
                        System.out.println("AM");
                else if (HourOfDay < 24)
                {
                        System.out.println("PM");
                }
                else
                {
                        System.out.println("" + HourOfDay + " is not a legal value.");
                        System.out.println("Please try a number between 0 and 23.");
                }

                HourOfDay = 25;
                if (HourOfDay < 12)
                        System.out.println("AM");
                else if (HourOfDay < 24)
                {
                        System.out.println("PM");
                }
                else
                {
                        System.out.println("" + HourOfDay + " is not a legal value.");
                        System.out.println("Please try a number between 0 and 23.");
                }

                System.out.println("End of program");
        }
}
