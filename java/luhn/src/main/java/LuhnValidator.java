class LuhnValidator {

    boolean isValid(String candidate) {
        candidate = candidate.replace(" ", "");
        if (candidate.length() <= 1) {
            return false;
        }
//        String reverse = "";
        int sum = 0;
//        for(int i = candidate.length() - 1; i >=0; i-- ){
//            reverse += candidate.charAt(i);
//        }
        for (int i = 0; i < candidate.length(); i++) {
            int a = candidate.charAt(i) - 48;
            if (a < 0 | a > 9) {
                return false;
            }
            if (i % 2 == 1) {
                a = a * 2;
                sum += a > 9 ? a - 9 : a;
            } else {
                sum += a;
            }
        }



//        for (int i = 0; i < reverse.length(); i++) {
//            int a = reverse.charAt(i) - 48;
//            if (a < 0 | a > 9) {
//                return false;
//            }
//            if (i % 2 == 0) {
//                a = a * 2;
//                sum += a > 9 ? a - 9 : a;
//            } else {
//                sum += a;
//            }
//        }
        return sum % 10 == 0;
    }

}
