package 동적계획법1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

//계단오르기
public class Stairs {

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		int[] arr = new int[n+1];
		int[] dp = new int[n+1];
  		for(int i = 1; i <= n; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}

  		dp[1] = arr[1];
  		
  		if(n >= 2) {
  			dp[2] = arr[1] + arr[2];
  		}
  		
 		for(int i = 3; i <= n; i++) {
 			//n-3, n-1, n 또는 n-2, n
 			dp[i] = Math.max(dp[i-3] + arr[i-1], dp[i-2]) + arr[i];
 		}
 		
 		System.out.println(Arrays.toString(dp));
 		
 		System.out.println(dp[n]);
 		br.close();
	}

}
