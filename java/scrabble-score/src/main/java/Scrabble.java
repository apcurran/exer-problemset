class Scrabble {

    private int score;

    Scrabble(String word) {
        for (char ch : word.toCharArray()) {
            char upperChar = Character.toUpperCase(ch);
            // find letter in letterValue helper fn
            int charPoints = calculateLetterValue(upperChar);
            // add points from letter val to total score
            setScore(charPoints);
        }
    }

    int calculateLetterValue(Character ch) {
        return switch (ch) {
            case 'A', 'E', 'I', 'O', 'U', 'L', 'N', 'R', 'S', 'T' -> 1;
            case 'D', 'G' -> 2;
            case 'B', 'C', 'M', 'P' -> 3;
            case 'F', 'H', 'V', 'W', 'Y' -> 4;
            case 'K' -> 5;
            case 'J', 'X' -> 8;
            case 'Q', 'Z' -> 10;
            default -> 0;
        };
    }

    private void setScore(int value) {
        this.score += value;
    }

    int getScore() {
        return score;
    }

}
