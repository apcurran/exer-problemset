class ProductionRemoteControlCar implements RemoteControlCar, Comparable<ProductionRemoteControlCar> {
    private int totalDistanceTravelled;
    private int numOfVictories;

    public void drive() {
        this.totalDistanceTravelled += 10;
    }

    public int getDistanceTravelled() {
        return this.totalDistanceTravelled;
    }

    public int getNumberOfVictories() {
        return this.numOfVictories;
    }

    public void setNumberOfVictories(int numberOfVictories) {
        this.numOfVictories = numberOfVictories;
    }

    @Override
    public int compareTo(ProductionRemoteControlCar other) {
        return Integer.compare(other.numOfVictories, this.numOfVictories);
    }
}
