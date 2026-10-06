public class CarsAssemble {

    private static final int CARS_PER_HOUR = 221;

    public double productionRatePerHour(int speed) {
        double successfulCarsTotal = speed * CARS_PER_HOUR;

        if (speed >= 5 && speed <= 8) {
            successfulCarsTotal *= .9;
        } else if (speed == 9) {
            successfulCarsTotal *= .8;
        } else if (speed == 10) {
            successfulCarsTotal *= .77;
        }

        return successfulCarsTotal;
    }

    public int workingItemsPerMinute(int speed) {
        double successfulItemsPerMin = productionRatePerHour(speed) / 60; // 60 min in 1 hr

        return (int) successfulItemsPerMin;
    }
}
