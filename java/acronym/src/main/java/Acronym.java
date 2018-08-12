class Acronym {

    private final String phrase;

    Acronym(String phrase) {
        this.phrase = phrase;
    }

    String get() {

        String TLA = "";
        String[] splitString = phrase.trim().split("(\\s+|-)");
        for (String s : splitString) {
            TLA += s.charAt(0);
        }
        return TLA.toUpperCase();
    }

}
