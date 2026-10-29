import java.util.Arrays;

class ResistorColorDuo {
    private final static String[] ALL_COLORS = {
        "black",
        "brown",
        "red",
        "orange",
        "yellow",
        "green",
        "blue",
        "violet",
        "grey",
        "white"
    };

    int value(String[] colors) {
        String color1 = colors[0];
        String color2 = colors[1];
        int color1Value = Arrays.asList(ALL_COLORS).indexOf(color1);
        int color2Value = Arrays.asList(ALL_COLORS).indexOf(color2);
        // ignore everything else

        return color1Value * 10 + color2Value;
    }
}
