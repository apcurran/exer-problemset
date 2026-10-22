class Fighter {

    private boolean vulnerability = false;

    boolean isVulnerable() {
        return this.vulnerability;
    }

    int getDamagePoints(Fighter fighter) {
        return 1;
    }


    public String toString() {
        return  "Fighter is a " + getClass().getSimpleName();
    }
}

class Warrior extends Fighter {
    @Override
    boolean isVulnerable() {
        return false;
    }

    @Override
    int getDamagePoints(Fighter target) {
        return target.isVulnerable() ? 10 : 6;
    }
}

// TODO: define the Wizard class
