import com.sun.source.tree.BreakTree;

import java.util.Random;

class CaptainsLog {

    private static final char[] PLANET_CLASSES = new char[]{'D', 'H', 'J', 'K', 'L', 'M', 'N', 'R', 'T', 'Y'};

    private Random randomNum;

    CaptainsLog(Random random) {
        this.randomNum = random;
    }

    char randomPlanetClass() {
        var random = new Random();
        int randomInt = random.nextInt(CaptainsLog.PLANET_CLASSES.length);

        return CaptainsLog.PLANET_CLASSES[randomInt];
    }

    String randomShipRegistryNumber() {
        throw new UnsupportedOperationException("Please implement the CaptainsLog.randomShipRegistryNumber() method");
    }

    double randomStardate() {
        throw new UnsupportedOperationException("Please implement the CaptainsLog.randomStardate() method");
    }
}
