package ¹®ÀÚ¿­;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Sum {

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		String s = br.readLine();
		br.close();
		String[] arr = s.split("");
		
		int sum = 0;
		for(int i = 0; i < arr.length; i++) {
			sum += Integer.parseInt(arr[i]);
		}
		
		System.out.println(sum);
	}

}
