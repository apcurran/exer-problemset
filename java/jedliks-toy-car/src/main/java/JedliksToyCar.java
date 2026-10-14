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
        // BEHAVIOR: covers 20 meters and drains one percent of the battery.
        // Prevent driving when the battery is drained
        if (this.battery == 0) {
            return;
        }

        // Update the number of meters driven when driving
        this.distance += 20;
        // Update the battery percentage when driving
        this.battery--;
    }
}
