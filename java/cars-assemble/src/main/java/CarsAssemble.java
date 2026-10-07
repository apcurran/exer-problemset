public class CarsAssemble {

    public double productionRatePerHour(int speed) {
        double successfulCarsTotal = speed * 221;

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
