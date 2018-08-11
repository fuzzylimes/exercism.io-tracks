class RaindropConverter {

    String convert(int number) {
        String rain = "";
        if (number % 3 == 0) {
            rain += "Pling";
        }
        if (number % 5 == 0) {
            rain += "Plang";
        }
        if (number % 7 == 0) {
            rain += "Plong";
        } 
        if (rain.isEmpty()) {
            rain += number;
        }
        return rain;
    }
}
