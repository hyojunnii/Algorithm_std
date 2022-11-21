package sort;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		
	/*
	 * 알고리즘 : 문제 푸는 방법(과정)
	 * - 정렬 sort (bubble)
	 */
		
	int[] arr = new int[] {10, 8, 3, 5, 1};
	
	bubbleSort(arr);
	System.out.println(Arrays.toString(arr));
	selectionSort(arr);
	System.out.println(Arrays.toString(arr));
	}
	
	public static void selectionSort(int[] arr) {
		//제일 작은거 찾아서 맨 앞에다 넣기
		for(int n = 0; n < arr.length; n++) {
			int minIdx = n;
			for(int i = 0; i < arr.length; i++) {
				if(arr[minIdx] > arr[i]) {
					minIdx = i;
				}
			}
			
			int temp = arr[minIdx];
			arr[minIdx] = arr[n];
			arr[n] = temp;
		}
	}
	
	public static void bubbleSort(int[] arr) {
		System.out.println("버블정렬");
		//인접 두값 비교
		for(int n = 0; n < arr.length; n++) {
			for(int i = 0; i < arr.length-1-n; i++) {
				if(arr[i] > arr[i+1]) {
					int temp = arr[i];
					arr[i] = arr[i+1];
					arr[i+1] = temp;
				}
			}
		}
	}
}
