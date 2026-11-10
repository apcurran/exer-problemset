import java.util.Map;

class SpaceAge {
    private static final double ONE_EARTH_YEAR_IN_SECONDS = 31_557_600;
    private static final Map<String, Double> planets = Map.of(
            "mercury", 0.2408467,
            "venus", 0.61519726,
            "earth", 1.0,
            "mars", 1.8808158,
            "jupiter", 11.862615,
            "saturn", 29.447498,
            "uranus", 84.016846,
            "neptune", 164.79132
    );
    private final double ageInSeconds;

    SpaceAge(double seconds) {
        ageInSeconds = seconds;
    }

    double getSeconds() {
        return ageInSeconds;
    }

    private double calculate(String planetName) {
        Double multiplier = planets.get(planetName);

        if (multiplier == null) {
            throw new IllegalArgumentException("Unknown planet: " + planetName);
        }

        double planetYearTimeInSeconds = ONE_EARTH_YEAR_IN_SECONDS * multiplier;

        return getSeconds() / planetYearTimeInSeconds;
    }

    double onEarth() {
        return calculate("earth");
    }

    double onMercury() {
        return calculate("mercury");
    }

    double onVenus() {
        return calculate("venus");
    }

    double onMars() {
        return calculate("mars");
    }

    double onJupiter() {
        return calculate("jupiter");
    }

    double onSaturn() {
        return calculate("saturn");
    }

    double onUranus() {
        return calculate("uranus");
    }

    double onNeptune() {
        return calculate("neptune");
    }

}
