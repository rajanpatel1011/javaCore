import java.util.*;
public class RunClockApplication {
private Clock myClock;
//or whatever this app is about (a Monster a Treasure a Weapon?
private Scanner input;
public RunClockApplication() {
myClock=new Clock();
input=new Scanner(System.in);
}
public void runApplication() {
String response;
int hrs, mins;
do {
printMenu();
response=input.nextLine();
if (response.equals("1")) {
System.out.print("enter hours: ");
hrs=input.nextInt(); input.nextLine();
System.out.print("enter minutes: ");
mins=input.nextInt(); input.nextLine();
myClock.setTime(hrs,mins);
}

else if (response.equals("2")||response.equals("3")||response.equals("4") ){
//deleted for space
}
else if (response.equals("5")) {
System.out.println(myClock.toString());
}
else if (response.equals("Q")|| response.equals("q")) {
System.out.println("Thank you for using the alarm clock"); //or break
}
else {
System.out.println("sorry - enter again");
}
} while (! ( (response.equals("Q"))|| (response.equals("q"))));
}
private void printMenu() {
System.out.println("What would you like to do:");
System.out.println("1 - set the Time on the clock");
System.out.println("2 - set the Alarm Time on the clock");
System.out.println("3 - turn the Alarm on");
System.out.println("4 - turn the Alarm off");
System.out.println("5 - see the situation");
System.out.println("Q - quit");
}
}