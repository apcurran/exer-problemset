class Fighter {

    private boolean vulnerability = false;

    boolean isVulnerable() {
        return this.vulnerability;
    }

    int getDamagePoints(Fighter fighter) {
        return 1;
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

    @Override
    public String toString() {
        return "Fighter is a Warrior";
    }
}

class Wizard extends Fighter {
    private boolean isSpellPrepared = false;

    void prepareSpell() {
        this.isSpellPrepared = true;
    }

    @Override
    boolean isVulnerable() {
        return !this.isSpellPrepared;
    }

    @Override
    int getDamagePoints(Fighter target) {
        return this.isSpellPrepared ? 12 : 3;
    }

    @Override
    public String toString() {
        return "Fighter is a Wizard";
    }
}
