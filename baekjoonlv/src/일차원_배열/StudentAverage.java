package 일차원_배열;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class StudentAverage {

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int c = Integer.parseInt(br.readLine());
		
		StringTokenizer st;
		int cnt;
		double[] arr;
		double n, av;
		
		for(int i = 0; i < c; i++) {
			st = new StringTokenizer(br.readLine());
			n = Integer.parseInt(st.nextToken());
			
			arr = new double[(int)n];
			av = 0;
			for(int j = 0; j < n; j++) {
				arr[j] = Integer.parseInt(st.nextToken());
				av += arr[j];
			}
			av = av / n;
			
			cnt = 0;
			for(int j = 0; j < arr.length; j++) {
				if(arr[j] > av) {
					cnt++;
				}
			}
			
			String result = String.format("%.3f", (100 / n * cnt));
			sb.append(result + "%\n");
		}
		
		System.out.println(sb);
	}
}
