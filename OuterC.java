class OuterC{
int num;
//inner class
private class InnerC {
public void print(){
System.out.println("This is an inner class");
}
}
// Accessor for private inner class method within
void display_Inner(){
InnerC inner = new InnerC();
inner.print();
}
}