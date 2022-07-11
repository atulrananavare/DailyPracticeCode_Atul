package dailyPracticeCode.March.day6;

public class StringRotationCheck {

	public static void main(String[] args) {
		String originalString = "decode";
		String toBeChecked = "deocde";

		System.out.println(checkForRotation(originalString, toBeChecked));

	}

	private static boolean checkForRotation(String originalString, String toBeChecked) {

		String concat = originalString + originalString;
		System.out.println(concat);
		if (concat.contains(toBeChecked)) {
			return true;
		}

		return false;
	}

}
