final class Formula {
static double speed(double distance, double time) { return distance/time;}
static double acceleration(double s2, double s1, double t) {return (s2-s1)/t;}
static double force(double mass, double acc) {return mass * acc;}
static double pressure(double force, double area) {return force / area;}
static double work(double force, double distance) {return force * distance;}
}