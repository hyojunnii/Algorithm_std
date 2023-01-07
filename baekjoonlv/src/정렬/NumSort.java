package 정렬;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class NumSort {

	//숫자 정렬
	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
		
		int[] arr = new int[n];
		for(int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		br.close();
		Arrays.sort(arr);
		
		for(int i = 0; i < arr.length; i++) {
			sb.append(arr[i]).append("\n");
		}
		
		System.out.println(sb);
	}
	
	public static void sort(int[] arr) {
		int temp;
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr.length-1-i; j++) {
				if(arr[j] > arr[j+1]) {
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
	}

}
