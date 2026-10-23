class ProductionRemoteControlCar implements RemoteControlCar {
    private int totalDistanceTravelled;

    public void drive() {
        this.totalDistanceTravelled += 10;
    }

    public int getDistanceTravelled() {
        return this.totalDistanceTravelled;
    }

    public int getNumberOfVictories() {
        throw new UnsupportedOperationException("Please implement the ProductionRemoteControlCar.getNumberOfVictories() method");
    }

    public void setNumberOfVictories(int numberOfVictories) {
        throw new UnsupportedOperationException("Please implement the ProductionRemoteControlCar.setNumberOfVictories() method");
    }
}
