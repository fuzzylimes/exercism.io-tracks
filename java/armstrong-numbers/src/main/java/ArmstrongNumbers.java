class ArmstrongNumbers {

	boolean isArmstrongNumber(int numberToCheck) {

		char[] digits = String.valueOf(numberToCheck).toCharArray();
		int exp = digits.length;
		int result = 0;

		for (char var : digits) {
			result += (int)Math.pow(Character.getNumericValue(var), exp);
		}

		return (result == numberToCheck);
		
	}

}
