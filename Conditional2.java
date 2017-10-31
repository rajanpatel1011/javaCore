class Conditional2
{
        public static void main(String Args[])
        {
                int HourOfDay = 10;

                if (HourOfDay < 12)
                        System.out.println("AM");
                else
                        System.out.println("PM");

                HourOfDay = 15;
                if (HourOfDay < 12)
                        System.out.println("AM");
                else
                        System.out.println("PM");

                System.out.println("End of program");
        }
}

