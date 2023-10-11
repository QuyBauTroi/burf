package Bai6_3;

public class Train extends Vehicle{
    private double speed = 40;

    public Train(String name, double speed) {
        super(name, speed);
    }

    public double claculateTime(double distance){
        return distance/speed;
    }

    @Override
    public String toString() {
        return "Train{" +
                "speed=" + speed +
                '}';
    }
}
