package 일차원_배열;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class MaxNum {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] arr = new int[9];
		for(int i = 0; i < 9; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		br.close();
		
		int max = arr[0];
		int index = 0;
		for(int i = 1; i < 9; i++) {
			max = Math.max(max, arr[i]);
			if(max == arr[i]) {
				index = i;
			}
		}
		
		System.out.println(max);
		System.out.println(index + 1);

	}

}
