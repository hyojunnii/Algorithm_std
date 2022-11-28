package 일차원_배열;

import java.io.*;
import java.util.Arrays;

public class Remainder {

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] arr = new int[10];
		for(int i = 0; i < 10; i++) {
			arr[i] = Integer.parseInt(br.readLine()) % 42;
		}
		br.close();
		
		Arrays.sort(arr);
		
		int cnt = 10;
		for(int i = 0; i < arr.length-1; i++) {
			if(arr[i] == arr[i+1]) {
				cnt--;
			}
		}
		
		System.out.println(cnt);
	}

}
