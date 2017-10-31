package packC;
public class Employee {
public Job j; //composition has-a relationship
Employee () {
this.j=new Job();
j.setSalary(1000L);
}
public long getSalary() { return j.getSalary(); }
}