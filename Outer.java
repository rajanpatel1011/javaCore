class Outer {
int n;
class Inner {
int ten = 10;
void setNToTen( ) { n = ten; }
}
void setN ( ) {
new Inner( ).setNToTen( );
}
}