public class Engineer extends Person {
String employer;
public String getName() { // New version
if (sex == MALE)
return ("Mr. " + name + ", Engineer");
else
return ("Ms. " + name + ", Engineer");
}}