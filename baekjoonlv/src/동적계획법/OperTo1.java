package 동적계획법;

import java.io.BufferedReader;
import java.io.InputStreamReader;

//1로 만들기
public class OperTo1 {

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());

		int[] dp = new int[n+1];
		dp[0] = dp[1] = 0;
		
		//bottom up 방식 - 순서주의
		for(int i = 2; i <= n; i++) {
			//1. 전값+1
			dp[i] = dp[i-1] + 1;
			//2. 나누어떨어지면 몫+1회
			if(i % 2 == 0) dp[i] = Math.min(dp[i], dp[i/2]+1);
			if(i % 3 == 0) dp[i] = Math.min(dp[i], dp[i/3]+1);
		}
		
		System.out.println(dp[n]);
		
	}

}
