import Bai6_3.Vehicle;

public class Plane extends Vehicle {
    private double speed = 60;

    public Plane(String name, double speed) {
        super(name, speed);
    }

    public double claculateTime(double distance){
        return distance/speed;
    }

    @Override
    public String toString() {
        return "Plane{" +
                "speed=" + speed +
                '}';
    }
}