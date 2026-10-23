public class ExperimentalRemoteControlCar implements RemoteControlCar {
    private int totalDistanceTravelled;

    public void drive() {
        this.totalDistanceTravelled += 20;
    }

    public int getDistanceTravelled() {
        return this.totalDistanceTravelled;
    }
}
