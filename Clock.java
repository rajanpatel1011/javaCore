public class Clock{
private Time alarm;
private Time time;
private boolean isSet;
public Clock(){
alarm=new Time();
time=new Time();
isSet=false;
}
public void setTime(int h, int m){
time.setTime(h,m);
}
public void setAT(int h, int m){
alarm.setTime(h,m);
}
public void turnOnAlarm(){
isSet=true;
}
public void turnOffAlarm(){
isSet=false;
}
public String toString(){
if (isSet) {
return "time is "+time.toString()+" and alarm is set to "+alarm.toString();
}
else { return "time is "+time.toString()+" and alarm is off";
}
}
}