public class Twofer {
    public String twofer(String name) {
        String otherPerson = (name == null || name.isBlank()) ? "you" : name;

        return "One for " + otherPerson + ", one for me.";
    }
}
