package java_interview_1.sorting;

public class SelectionSort {

	public static void main(String[] args) {
		int arr[] = {45,78,90,2,47,21};
		SelectionSort obj = new SelectionSort();
		obj.sort(arr);
		obj.printArray(arr);
	}

	private void printArray(int[] arr) {
		int size = arr.length;
		for(int i = 0 ; i< size; i++) {
			System.out.print(arr[i]+" ");
		}
		
	}

	private void sort(int[] arr) {
		int size  = arr.length;
		for(int i = 0 ; i < size-1;i++) {
			int min_index = i;
			for(int j = i+1 ; j < size ; j++) {
				if(arr[j] < arr[min_index] ) {
					min_index = j;
				}
			}
			int temp = arr[min_index];
			arr[min_index]=arr[i];
			arr[i] = temp;
		}
		
	}
	
}
