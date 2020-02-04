
public class PalandomNumber {

	public static void main(String[] args) {
		int inputNumber = 121;
		System.out.println(
				new PalandomNumber().isPalandromNumber(inputNumber, new PalandomNumber().reverseNumber(inputNumber)));
	}

	public int reverseNumber(int number1) {
		int remainder = 0;
		int reversernumber = 0;

		int number = number1;
		remainder = number1;
		while (number > 0) {
			number = (number / 10);
			remainder = (remainder % 10);
			reversernumber = reversernumber * 10 + remainder;
			remainder = number;
		}
		return reversernumber;
	}

	public boolean isPalandromNumber(int originalNumber, int reverNumber) {
		return reverNumber == originalNumber ? true : false;
	}
}
