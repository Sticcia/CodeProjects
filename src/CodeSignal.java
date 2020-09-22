public class CodeSignal {
	int[] mutateTheArray(int n, int[] a) {
		int[] b = new int[n];

		for (int i = 0; i < n; i++) {
			b[i] = a[i];

			if (i - 1 >= 0) {
				b[i] += a[i - 1];
			}

			if (i + 1 < n) {
				b[i] += a[i + 1];
			}
		}

		return b;
	}

	boolean alternatingSort(int[] a) {
		int[] b = new int[a.length];
		int x = 0;
		int y = a.length - 1;

		for (int i = 0; i < a.length; i++) {
			if (i % 2 == 0) {
				b[i] = a[x];
				x++;
			} else {
				b[i] = a[y];
				y--;
			}

			if (i > 0 && b[i] <= b[i - 1]) {
				return false;
			}
		}

		return true;
	}

	int[][] meanGroups(int[][] a) {
		int[][] b = new int[0][];
		int sum = 0;
		double[] means = new double[a.length];
		int x = 0;

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				sum += a[i][j];
			}
			means[i] = sum / a[i].length - 1;
			sum = 0;
		}

		for (int i = 0; i < means.length; i++) {
			double aux = means[i];
			for (int j = i; j < means.length; j++) {
				if (means[j] == aux) {
					b[i][x] = j;
					x++;
				}
			}
		}

		return b;
	}
}
