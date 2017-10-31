public class Person {
public static final int MALE = 0, FEMALE = 1;
protected String name;
int sex;
public void setName(String n) { // Accessor
name = n;
}
public String getName() {// Accessor
if (sex == MALE) {return("Mr. " + name);}
else {return("Ms. " + name);}
}
}