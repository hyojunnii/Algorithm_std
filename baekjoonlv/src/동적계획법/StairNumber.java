package 동적계획법;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

//쉬운 계단 수
public class StairNumber {
	
	public static long[][] dp;
	public final static long mod = 1000000000;

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		dp = new long[N+1][10];
		
		//첫자리는 무조건 한개
		for(int i = 1; i < 10; i++) {
			dp[1][i] = 1;
		}
		
		//두번째자리수부터 N까지
		for(int i = 2; i <= N; i++) {
			for(int j = 0; j < 10; j++) {
				//0이면 이전자리의 1자리만 가능
				if(j == 0) dp[i][0] = dp[i-1][1] % mod;
				//9면 이전자리의 8자리만 가능
				else if(j == 9) dp[i][9] = dp[i-1][8] % mod;
				//이외의 경우 이전자리의 -1, +1자리
				else dp[i][j] = dp[i-1][j-1] + dp[i-1][j+1] % mod;
			}
		}
		
		System.out.println(Arrays.deepToString(dp));
		
		long result = 0;
		for(int i = 0; i < 10; i++) {
			result += dp[N][i];
		}
		
		System.out.println(result % mod);
	
		System.out.println();
		br.close();	
	}
}
