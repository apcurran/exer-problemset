class SqueakyClean {
    static String clean(String dirtyStr) {
        StringBuilder cleanStr = new StringBuilder();
        boolean capitalizeNext = false;

        for (char dirtyCh: dirtyStr.toCharArray()) {
            // 3. Convert leetspeak to normal text
            char ch = convertLeetSpeak(dirtyCh);

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

    private static char convertLeetSpeak(char ch) {
        if (ch == '4') {
            return 'a';
        } else if (ch == '3') {
            return 'e';
        } else if (ch == '0') {
            return 'o';
        } else if (ch == '1') {
            return 'l';
        } else if (ch == '7') {
            return 't';
        } else {
            return ch;
        }
    }
}
