class FormulaMain{
public static void main(String[] args) {
double d1 = 50, t1 = 10;
double d2 = 80, t2 = 10;
double mass = 50;
double s1 = Formula.speed(d1, t1);
double s2 = Formula.speed(d2, t2);
double acc = Formula.acceleration(s2, s1, 60);
double force = Formula.force(mass, acc);
double pressure = Formula.work(force,10);
System.out.println("If I weigh " + mass + " kg, and");
System.out.println("\t my initial speed is " + s1 + " m/s, and");
System.out.println("\t my final speed is " + s2 + " m/s.");
System.out.println("Then, my acceleration in 1 minute is " + acc + " m/s2, and");
System.out.println("\t I'm exerting a force of " + force + " newton, and");
System.out.println("\t a pressure of " + pressure + " joules for 10 meters!");
System.out.println("ehem ;-)");
}}