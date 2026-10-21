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
        throw new UnsupportedOperationException("Please implement the (static) NeedForSpeed.nitro() method");
    }
}

class RaceTrack {
    private int distance;

    RaceTrack(int distance) {
        this.distance = distance;
    }

    public boolean canFinishRace(NeedForSpeed car) {
        throw new UnsupportedOperationException("Please implement the RaceTrack.canFinishRace() method");
    }
}
