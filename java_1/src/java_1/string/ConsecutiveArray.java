package java_1.string;

import java.util.Arrays;

public class ConsecutiveArray {
	public static void main(String[] args) {
		int[] arr = { 5, 9, 6, 8, 7, 10 };
		Arrays.sort(arr);
		ConsecutiveArray a1 = new ConsecutiveArray();
		a1.printArray(arr);
		a1.checkConsecutive(arr);
	}

	public void printArray(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	public void checkConsecutive(int arr[]) {
		int length = arr.length;
		boolean result = true;
		for (int i = 0; i < length - 1; i++) {
			if (arr[i + 1] - arr[i] == 1) {
			} else {
				result = false;
				break;
			}
		}
		if(result) {
			System.out.println("consecutive");
		}else {
			System.out.println("not consecutive");
		}

	}
}
