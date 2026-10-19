import java.util.Random;

class CaptainsLog {

    private static final char[] PLANET_CLASSES = new char[]{'D', 'H', 'J', 'K', 'L', 'M', 'N', 'R', 'T', 'Y'};

    private Random randomNum;

    CaptainsLog(Random random) {
        this.randomNum = random;
    }

    char randomPlanetClass() {
        int randomInt = this.randomNum.nextInt(CaptainsLog.PLANET_CLASSES.length);

        return CaptainsLog.PLANET_CLASSES[randomInt];
    }

    String randomShipRegistryNumber() {
        int rangeStart = 1_000;
        int rangeEnd = 10_000;
        int rangeSize = rangeEnd - rangeStart;
        int randomInt = rangeStart + this.randomNum.nextInt(rangeSize);

        return "NCC-" + randomInt;
    }

    double randomStardate() {
        throw new UnsupportedOperationException("Please implement the CaptainsLog.randomStardate() method");
    }
}
