import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class ProteinTranslator {

    private static HashMap<String, String> codons = new HashMap<>();

    ProteinTranslator() {
        codons.put("AUG", "Methionine");
        codons.put("UUU", "Phenylalanine");
        codons.put("UUC", "Phenylalanine");
        codons.put("UUA", "Leucine");
        codons.put("UUG", "Leucine");
        codons.put("UCU", "Serine");
        codons.put("UCC", "Serine");
        codons.put("UCA", "Serine");
        codons.put("UCG", "Serine");
        codons.put("UAU", "Tyrosine");
        codons.put("UAC", "Tyrosine");
        codons.put("UGU", "Cysteine");
        codons.put("UGC", "Cysteine");
        codons.put("UGG", "Tryptophan");
        codons.put("UAA", "STOP");
        codons.put("UAG", "STOP");
        codons.put("UGA", "STOP");
    }

    List<String> translate(String rnaSequence) {

        String a;
        List<String> split = new ArrayList<>();
        for (String codon : splitCodons(rnaSequence)) {
            a = codons.get(codon);
            if (a.equals("STOP")) return split;
            split.add(a);
        }
        return split;
    }

    private static List<String> splitCodons(String string) {
        List<String> split = new ArrayList<>();
        int len = string.length();
        for (int i = 0; i < len; i+= 3) {
            split.add(string.substring(i, Math.min(len, i + 3)));
        }
        return split;
    }
}