class Proverb {

    private final String[] words;

    Proverb(String[] words) {
        this.words = words;
    }

    String recite() {

        String proverb = "";
        for (int i = 0; i <= words.length - 2; i++) {
            proverb += "For want of a " + words[i] + " the " + words[i+1] + " was lost.\n";
        }
        return words.length == 0 ? proverb : proverb + "And all for the want of a " + words[0] + ".";
    }

}
