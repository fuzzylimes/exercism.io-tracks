import java.util.HashMap;

class Scrabble {

    private final String word;
    private final static HashMap<Character, Integer> LETTERS = new HashMap<>();

    Scrabble(String word) {
        this.word = word.toUpperCase();
        LETTERS.put('A', 1);
        LETTERS.put('B', 3);
        LETTERS.put('C', 3);
        LETTERS.put('D', 2);
        LETTERS.put('E', 1);
        LETTERS.put('F', 4);
        LETTERS.put('G', 2);
        LETTERS.put('H', 4);
        LETTERS.put('I', 1);
        LETTERS.put('J', 8);
        LETTERS.put('K', 5);
        LETTERS.put('L', 1);
        LETTERS.put('M', 3);
        LETTERS.put('N', 1);
        LETTERS.put('O', 1);
        LETTERS.put('P', 3);
        LETTERS.put('Q', 10);
        LETTERS.put('R', 1);
        LETTERS.put('S', 1);
        LETTERS.put('T', 1);
        LETTERS.put('U', 1);
        LETTERS.put('V', 4);
        LETTERS.put('W', 4);
        LETTERS.put('X', 8);
        LETTERS.put('Y', 4);
        LETTERS.put('Z', 10);
    }

    int getScore() {

        int score = 0;
        for (int i = 0; i < word.length(); i++) {
            score += LETTERS.get(word.charAt(i));
        }
        return score;
    }

}
