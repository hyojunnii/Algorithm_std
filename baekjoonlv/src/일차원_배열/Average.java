package 일차원_배열;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Average {

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		StringTokenizer st;
		double[] arr = new double[n];
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		br.close();
		
		Arrays.sort(arr);
		
		double max = arr[arr.length-1];
		double av = 0;
		for(int i = 0; i < arr.length; i++) {
			arr[i] = arr[i] / max * 100;
			av += arr[i];
		}
		
		System.out.println(av / n);
	}

}
