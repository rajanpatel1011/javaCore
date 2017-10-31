class LocalClassExample {
private String message = "Inner class is printing!";
public void method ( ) {
int j = 20;
final int k = 30;
class Local {
public void test ( ) {
System.out.println(j); //Error as j is not final
System.out.println("Local method() final var k="+k); //OK k is final
//Like an inner class, instance variables of
//the enclosing object can be accessed.
System.out.println ( "name" ) ;
}
}
Local loc = new Local ( ) ;
loc.test ( ) ;
}
public static void main ( String [ ] args ) {
LocalClassExample obj = new LocalClassExample ( );
obj.method ( ) ;
}
}