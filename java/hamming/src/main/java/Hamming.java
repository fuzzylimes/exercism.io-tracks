class Hamming {

    private static char[] leftStrand, rightStrand;

    Hamming(String leftStrand, String rightStrand) {
        if (leftStrand.length() != rightStrand.length()) {
            throw new IllegalArgumentException("leftStrand and rightStrand must be of equal length.");
        }
        this.leftStrand = leftStrand.toCharArray();
        this.rightStrand = rightStrand.toCharArray();
    }

    int getHammingDistance() {
        int diff = 0;
        for (int i = 0; i < leftStrand.length; i++) {
            if (leftStrand[i] != rightStrand[i]) diff++;
        }
        return diff;
    }

}
