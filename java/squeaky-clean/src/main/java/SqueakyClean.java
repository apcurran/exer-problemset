class SqueakyClean {
    static String clean(String dirtyStr) {
        StringBuilder cleanStr = new StringBuilder();

        for (char ch: dirtyStr.toCharArray()) {
            if (Character.isWhitespace(ch)) {
                cleanStr.append('_');
            } else {
                cleanStr.append(ch);
            }
        }

        return cleanStr.toString();
    }

    static void main(String[] args) {
        System.out.println(clean("my  id"));
    }
}
