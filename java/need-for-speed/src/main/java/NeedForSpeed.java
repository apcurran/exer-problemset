class NeedForSpeed {
    private int speed;
    private int batteryDrain;
    private int batteryPercentage = 100;
    private int totalDistance;
    // constructor
    NeedForSpeed(int speed, int batteryDrain) {
        this.speed = speed;
        this.batteryDrain = batteryDrain;
    }

    public boolean batteryDrained() {
        return this.batteryPercentage < this.batteryDrain;
    }

    public int distanceDriven() {
        return this.totalDistance;
    }

    public void drive() {
        if (this.batteryDrained()) {
            return;
        }

        this.totalDistance += this.speed;
        this.batteryPercentage -= this.batteryDrain;
    }

    public static NeedForSpeed nitro() {
        return new NeedForSpeed(50, 4);
    }
}

class RaceTrack {
    private int distance;

    RaceTrack(int distance) {
        this.distance = distance;
    }

    public boolean canFinishRace(NeedForSpeed car) {
        while (!car.batteryDrained()) {
            // drive until battery is depleted
            car.drive();
        }

        // have we gone far enough to cover the distance?
        return car.distanceDriven() >= this.distance;
    }
}
