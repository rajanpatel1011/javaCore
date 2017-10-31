class Driver3 {
static Person p1;
static Engineer e1;
static {
p1 = new Person();
p1.setName("Marie Sklodowska Curie");
p1.sex = Person.FEMALE;
e1 = new Engineer();
e1.setName("Norm Augustine");
e1.sex = Person.MALE;
e1.employer = "Lockheed Martin";
}
static void printPerson(Person p) {
System.out.println(p.getName());
} 
public static void main(String[] a) {
printPerson(p1);
printPerson(e1);
}
}