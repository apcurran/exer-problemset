import java.util.List;

class HighScores {

    List<Integer> myScores;

    // constructor method
    public HighScores(List<Integer> highScores) {
        this.myScores = highScores;
    }

    List<Integer> scores() {
        return myScores;
    }

    Integer latest() {
        return myScores.getLast();
    }

    Integer personalBest() {
        return myScores.stream()
                .max(Integer::compare)
                .orElseThrow();
    }

    List<Integer> personalTopThree() {
        throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
    }

}
