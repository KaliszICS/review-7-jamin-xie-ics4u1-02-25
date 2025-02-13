public class PracticeProblem {

	public static void main(String args[]) {
	}

	public static String evenOrOdd(int num) {
		if (num % 2 == 0) {
			return "Even";
		}
		return "Odd";
	}

	public static String teacherOrStudent(String word) {
		if (word.trim().contains("Kalisz")) {
			return "Teacher";
		}
		return "Student";
	}

	public static int fartherFromZero(int num) {
		if (num > 0) {
			return num + 5;
		}
		if (num < 0) {
			return num - 5;
		}
		return 0;
	}

	public static String isFive(int num) {
		if (num == 5) {
			return "The number is Five";
		}
		else {
			return "The number is not Five";
		}
	}

	public static String positiveOrNegative(int num) {
		if (num > 0 && num != 0) {
			return "Positive";
		}
		else {
			return "Negative";
		}
	}

	public static String highOrLow(int num) {
		if (num > 100) {
			return "High";
		}
		else {
			return "Low";
		}
	}

	public static String isHello(String word) {
		if (word.equals("Hello")) {
			return "The word is Hello";
		}
		else {
			return "The word is not Hello";
		}
	}
}
