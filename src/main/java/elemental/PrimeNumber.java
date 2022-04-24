package elemental;

// The number which is only divisible by itself and 1 is known as prime number.
class PrimeNumber {

	public static void main(String[] args) {

		String primeNumbers = "";

		for (int i = 1; i <= 100; i++) {
			int counter = 0;
			for (int j = i; j >= 1; j--) {
				if (i % j == 0) {
					counter = counter + 1;
				}
			}
			if (counter == 2) {
				primeNumbers = primeNumbers + i + " ";
			}
		}
		System.out.println("Prime numbers from 1 to 100 are :");
		System.out.println(primeNumbers);
	}
}