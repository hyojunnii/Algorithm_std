package ������ȹ��1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class RisingSequence {

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());

		int[] arr = new int[n+1];
 		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 1; i <= n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		int[] dp = new int[n+1];
		dp[1] = 1;
		
		int len = 1;
		for(int i = 2; i <= n; i++) {
			int tmp = 0;
			
			for(int j = 1; j < i; j++) {
				if(arr[j] < arr[i]) {
					tmp = Math.max(tmp, dp[j]);
				}
			}
			
			dp[i] = tmp+1;
			len = Math.max(len, dp[i]);
		}
		
		System.out.println(len);
		br.close();
	}

}
