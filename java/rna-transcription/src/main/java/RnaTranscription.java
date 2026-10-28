import java.util.Map;

class RnaTranscription {

    private static final Map<Character, Character> DNA_TO_RNA =
            Map.of('G', 'C', 'C', 'G', 'T', 'A', 'A', 'U');

    String transcribe(String dnaStrand) {
        StringBuilder result = new StringBuilder(dnaStrand.length());

        for (char nucleotide : dnaStrand.toCharArray()) {
            result.append(DNA_TO_RNA.get(nucleotide));
        }

        return result.toString();
    }

}
