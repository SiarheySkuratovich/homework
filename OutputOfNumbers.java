public class OutputOfNumbers {
	public static void main (String[] args) {
		for (int k = 0; k <= 100; k++) {
			if (k % 3 == 0) {
				System.out.println("3*" + k/3);
			} else {
				System.out.println(k);
			}
		}
	}
}
