public class JedliksToyCar {
    private int distance = 0;
    private int battery = 100;

    public static JedliksToyCar buy() {
        return new JedliksToyCar();
    }

    public String distanceDisplay() {
        return "Driven " + this.distance + " meters";
    }

    public String batteryDisplay() {
        if (this.battery == 0) {
            return "Battery empty";
        }

        // otherwise, return value
        return "Battery at " + this.battery + "%";
    }

    public void drive() {
        throw new UnsupportedOperationException("Please implement the JedliksToyCar.drive()  method");
    }
}
