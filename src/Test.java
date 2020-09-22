public class Test {
	public boolean solution(int[] A) {
		int start = 1;
		int end = A.length - 2;
		int sumStart = A[0];
		int sumEnd = A[A.length - 1];
		int sumMid = 0;

		while (start < end) {

			if (sumStart < sumEnd) {
				sumStart += A[start];
				start++;
			} else if (sumStart > sumEnd) {
				sumEnd += A[end];
				end--;
			} else if (sumStart == sumEnd){
				sumMid = 0;

				for (int i = start + 1; i < end; i++) {
					sumMid += A[i];

					if (sumMid > sumStart)
						break;
				}

				if (sumMid > sumStart) {
					sumStart += A[start];
					start++;
				} else if (sumMid == sumStart) {
					return true;
				} else if (sumMid < sumStart) {
					return false;
				}
			}
		}
		return false;
	}
}
