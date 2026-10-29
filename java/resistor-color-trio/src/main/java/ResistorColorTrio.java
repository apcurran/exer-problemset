import java.util.List;

class ResistorColorTrio {
    private static final List<String> COLORS = List.of(
            "black", "brown", "red", "orange", "yellow",
            "green", "blue", "violet", "grey", "white"
    );

    String label(String[] colors) {
        int first = COLORS.indexOf(colors[0]);
        int second = COLORS.indexOf(colors[1]);
        int zeros = COLORS.indexOf(colors[2]);
        // main value (e.g. 33) times 10^zeros (e.g. 33 * 1000 = 33000)
        // very large value needs a long instead of an int
        long base = first * 10 + second;
        long ohms = base * (long) Math.pow(10, zeros);

        if (ohms >= 1_000_000_000L) {
            return (ohms / 1_000_000_000L) + " gigaohms";
        } else if (ohms >= 1_000_000L) {
            return (ohms / 1_000_000L) + " megaohms";
        } else if (ohms >= 1_000L) {
            return (ohms / 1_000L) + " kiloohms";
        } else {
            return ohms + " ohms";
        }
    }
}
