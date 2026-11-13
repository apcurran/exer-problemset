import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

class DnDCharacter {

    private final int strength;
    private final int dexterity;
    private final int constitution;
    private final int intelligence;
    private final int wisdom;
    private final int charisma;
    private final int hitpoints;

    DnDCharacter() {
        strength = ability(rollDice());
        dexterity = ability(rollDice());
        constitution = ability(rollDice());
        intelligence = ability(rollDice());
        wisdom = ability(rollDice());
        charisma = ability(rollDice());
        hitpoints = 10 + constitutionModifier(constitution);
    }

    int ability(List<Integer> scores) {
        // recording the sum of the largest three dice
        int sum = scores.stream()
                .mapToInt(Integer::intValue)
                .sum();
        int smallest = Collections.min(scores);

        return sum - smallest;
    }

    List<Integer> rollDice() {
        // roll 4 times
        List<Integer> randomValues = new ArrayList<>();

        for (int i = 1; i <= 4; i++) {
            int randomVal = generateRandomInt1To6();
            randomValues.add(randomVal);
        }

        return randomValues;
    }

    int generateRandomInt1To6() {
        Random rand = new Random();
        // generates a random num between 0 and 6 (exclusive)
        int randomNum = rand.nextInt(6);
        int OFFSET = 1;

        return randomNum + OFFSET; // 1 to 6 random num
    }

    int constitutionModifier(int input) {
        return Math.floorDiv((input - 10), 2);
    }

    int getStrength() {
        return strength;
    }

    int getDexterity() {
        return dexterity;
    }

    int getConstitution() {
        return constitution;
    }

    int getIntelligence() {
        return intelligence;
    }

    int getWisdom() {
        return wisdom;
    }

    int getCharisma() {
        return charisma;
    }

    int getHitpoints() {
        return hitpoints;
    }
}
