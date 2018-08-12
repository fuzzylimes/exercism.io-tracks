class IsbnVerifier {

    boolean isValid(String stringToVerify) {

        stringToVerify = stringToVerify.toUpperCase().replace("-", "");
        int sum = 0;
        for (int i = 0; i < stringToVerify.length(); i++) {
            char c = stringToVerify.charAt(i);
            if (c >= '0' && c <= '9') {
                sum += ((stringToVerify.length() - i) * Character.getNumericValue(c));
            } else if (c == 'X' && i == (stringToVerify.length() - 1)) {
                sum += ((stringToVerify.length() - i) * 10);
            } else {
                return false;
            }
        }

        return sum > 0 ? sum % 11 == 0 : false;
    }

}
