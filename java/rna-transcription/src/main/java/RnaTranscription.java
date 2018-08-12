import java.util.HashMap;

class RnaTranscription {

    private static HashMap<Character, Character> dna = new HashMap<>();

    RnaTranscription() {
        dna.put('G', 'C');
        dna.put('C', 'G');
        dna.put('T', 'A');
        dna.put('A', 'U');
    }

    String transcribe(String dnaStrand) {
        String decode = "";
        for (int i = 0; i < dnaStrand.length(); i++) {
            decode += dna.get(dnaStrand.charAt(i));
        }
        return decode;
    }

}
