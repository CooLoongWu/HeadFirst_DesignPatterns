package cooloongwu.com.command;

/**
 * 吊扇类，包括速度的控制
 */
public class CeilingFan {
    public static final int HIGH = 3;
    public static final int MEDIUM = 2;
    public static final int LOW = 1;
    public static final int OFF = 0;

    String location;
    int speed;

    public CeilingFan(String location) {
        this.location = location;
        speed = OFF;
    }

    public void high() {
        this.speed = HIGH;
        System.out.println("HIGH");
    }

    public void medium() {
        this.speed = MEDIUM;
        System.out.println("MEDIUM");
    }

    public void low() {
        this.speed = LOW;
        System.out.println("LOW");
    }

    public void off() {
        this.speed = OFF;
        System.out.println("OFF");
    }

    public int getSpeed() {
        return speed;
    }
}
