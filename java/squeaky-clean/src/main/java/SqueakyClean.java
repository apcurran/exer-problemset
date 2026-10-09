class SqueakyClean {
    static String clean(String dirtyStr) {
        StringBuilder cleanStr = new StringBuilder();
        boolean capitalizeNext = false;

        for (char ch: dirtyStr.toCharArray()) {
            if (Character.isWhitespace(ch)) {
                cleanStr.append('_');
            } else if (ch == '-') {
                capitalizeNext = true;
            } else if (capitalizeNext) {
                cleanStr.append(Character.toUpperCase(ch));
                capitalizeNext = false;
            } else {
                cleanStr.append(ch);
            }
        }

        return cleanStr.toString();
    }

    static void main(String[] args) {
        System.out.println(clean("my  id")); // "my__id"
        System.out.println(clean("a-bc")); // "aBc"
    }
}
