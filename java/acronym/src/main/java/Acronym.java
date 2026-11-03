class Acronym {

    private final String fullPhrase;

    Acronym(String phrase) {
        this.fullPhrase = phrase;
    }

    String get() {
        var myAcronym = new StringBuilder();
        String cleanText = fullPhrase
                .replace("-", " ")
                .replaceAll("[^A-Za-z\\s]", "");

        for (String word : cleanText.trim().split("\\s+")) {
            if (word.isEmpty()) {
                continue;
            }

            char upperInitial = Character.toUpperCase(word.charAt(0));
            myAcronym.append(upperInitial);
        }

        return myAcronym.toString();
    }

}
