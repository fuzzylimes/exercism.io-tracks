public class PangramChecker {

    public boolean isPangram(String input) {
        if (input.length() < 26) {
            return false;
        }
        boolean[] alphabet = new boolean[26];
        int left = alphabet.length;
        for (int i = 0; i < input.length(); i++) {
            char j = Character.toLowerCase(input.charAt(i));
            if (j >= 'a' && j <= 'z') {
                int idx = j - 'a';
                if (!alphabet[idx]) {
                    alphabet[idx] = true;
                    left--;
                    if (left == 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

}
