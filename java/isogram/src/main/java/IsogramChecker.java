import java.util.HashSet;
import java.util.Set;

class IsogramChecker {

    boolean isIsogram(String phrase) {
        String phraseWithoutHyphensOrSpaces = phrase.replaceAll("[ -]", "");
        String lowerPhrase = phraseWithoutHyphensOrSpaces.toLowerCase();
        Set<Character> chars = new HashSet<>();

        for (char ch : lowerPhrase.toCharArray()) {
            if (chars.contains(ch)) {
                return false;
            }

            chars.add(ch);
        }

        return true;
    }

}
