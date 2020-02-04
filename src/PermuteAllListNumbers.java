public class PermuteAllListNumbers {
	static void permute(int[] a, int k) {
		if (k == a.length) {
			for (int i = 0; i < a.length; i++) {
				System.out.print(" [" + a[i] + "] ");
			}
			System.out.println();
		} else {
			for (int i = k; i < a.length; i++) {
				swep(a, k, i);

				permute(a, k + 1);

				swep(a, k, i);
			}
		}
	}

	private static void swep(int a[], int i, int k) {
		int temp = a[k];
		a[k] = a[i];
		a[i] = temp;
	}

	public static void main(String args[]) {
		int[] sequence = { 1, 2, 3 };

		System.out.println("\n The permuted sequences are: ");
		permute(sequence, 0);

	}
}