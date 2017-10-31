public class Time{ //currently both versions commented out
private int timeinMinutes;
public Time(){
timeinMinutes=60;
}
public void setTime (int h, int m) {
timeinMinutes=h*60+m;
}
public String toString() {
int h=timeinMinutes/60;
int m=timeinMinutes%60;
return h+ " : "+m;
}
public Time difference(Time other){
int minsTemp=this.timeinMinutes-other.timeinMinutes;
int h=minsTemp/60; int m=minsTemp%60;
Time ret=new Time();
ret.setTime(h,m);
return ret;
}
}