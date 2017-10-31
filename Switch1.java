class Switch1
{
        public static void main(String[] Args)
        {
                int AccessLevel = 1;

                switch (AccessLevel)
                {
                        case 0:
                                System.out.println("Administrator");
                        case 1:
                                System.out.println("Staff");
                        case 2:
                                System.out.println("Guest");
                        default:
                                System.out.println("Restricted");
                }
        }
}

