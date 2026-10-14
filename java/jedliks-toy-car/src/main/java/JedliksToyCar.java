public class JedliksToyCar {
    private int distance = 0;
    private int battery = 100;

    public static JedliksToyCar buy() {
        return new JedliksToyCar();
    }

    public String distanceDisplay() {
        throw new UnsupportedOperationException("Please implement the JedliksToyCar.distanceDisplay()  method");
    }

    public String batteryDisplay() {
        throw new UnsupportedOperationException("Please implement the JedliksToyCar.batteryDisplay()  method");
    }

    public void drive() {
        throw new UnsupportedOperationException("Please implement the JedliksToyCar.drive()  method");
    }
}
