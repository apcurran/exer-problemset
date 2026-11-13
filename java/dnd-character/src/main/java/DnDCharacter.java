import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

class DnDCharacter {

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

        return  randomValues;
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
        throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
    }

    int getDexterity() {
        throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
    }

    int getConstitution() {
        throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
    }

    int getIntelligence() {
        throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
    }

    int getWisdom() {
        throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
    }

    int getCharisma() {
        throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
    }

    int getHitpoints() {
        throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
    }
}
