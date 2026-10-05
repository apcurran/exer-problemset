public class Lasagna {
    public int expectedMinutesInOven() {
        return 40;
    }

    public int remainingMinutesInOven(int cookingMinSoFar) {
        return expectedMinutesInOven() - cookingMinSoFar;
    }

    public int preparationTimeInMinutes(int layers) {
        int TIME_TO_PREP_LAYER = 2;

        return layers * TIME_TO_PREP_LAYER;
    }

    public int totalTimeInMinutes(int layers, int minutesInOven) {
        return preparationTimeInMinutes(layers) + minutesInOven;
    }
}
