class SqueakyClean {
    static String clean(String dirtyStr) {
        StringBuilder cleanStr = new StringBuilder();
        boolean capitalizeNext = false;

        // 3. Convert leetspeak to normal text
        String convertedStr = convertLeetSpeak(dirtyStr);

        for (char ch: convertedStr.toCharArray()) {
            if (Character.isWhitespace(ch)) {
                cleanStr.append('_');
            } else if (ch == '-') {
                capitalizeNext = true;
            } else if (capitalizeNext) {
                cleanStr.append(Character.toUpperCase(ch));
                capitalizeNext = false;
            } else if (!Character.isLetter(ch)) {
                // 4. Omit characters that are not letters
                continue;
            } else {
                cleanStr.append(ch);
            }
        }

        return cleanStr.toString();
    }

    static String convertLeetSpeak(String str) {
        StringBuilder sb = new StringBuilder();

        for (char ch: str.toCharArray()) {
            if (ch == '4') {
                sb.append('a');
            } else if (ch == '3') {
                sb.append('e');
            } else if (ch == '0') {
                sb.append('o');
            } else if (ch == '1') {
                sb.append('l');
            } else if (ch == '7') {
                sb.append('t');
            } else {
                sb.append(ch);
            }
        }

        return sb.toString();
    }

    static void main(String[] args) {
        System.out.println(clean("my  id")); // "my__id"
        System.out.println(clean("a-bc")); // "aBc"
    }
}
