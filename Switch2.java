class Switch2
{
        public static void main(String[] Args)
        {
                int AccessLevel = 1;

                switch (AccessLevel)
                {
                        case 0:
                                System.out.println("Administrator");
                                break;
                        case 1:
                                System.out.println("Staff");
                                break;
                        case 2:
                                System.out.println("Guest");
                                break;
                        default:
                                System.out.println("Restricted");
                }
        }
}
