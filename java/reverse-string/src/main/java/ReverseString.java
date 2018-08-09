class ReverseString {

    String reverse(String inputString) {
        // Easier way
        // return new StringBuilder(inputString).reverse().toString();

        // More verbose
        int i;
        int len = inputString.length();
        String backwards = "";
        for( i = len - 1; i >=0; i-- ){
            backwards += inputString.charAt(i);
        }
        return backwards;
    }
  
}