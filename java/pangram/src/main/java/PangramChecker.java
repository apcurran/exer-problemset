public class PangramChecker {

    public boolean isPangram(String input) {
        return input.toLowerCase().chars()
                .filter(ch -> ch >= 'a' && ch <= 'z')
                .distinct()
                .count() == 26;
    }

}
