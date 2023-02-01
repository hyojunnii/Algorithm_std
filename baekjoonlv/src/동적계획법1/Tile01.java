package 동적계획법1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

//01타일
// 메모이제이션, 2가지 방식
public class Tile01 {

	public static Integer[] dp = new Integer[1000001];
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		dp[0] = 0;
		dp[1] = 1;
		dp[2] = 2;
		
		System.out.println(tile(n));
		br.close();
		
	}
	
	//fibonacci
	public static int tile(int n) {
		//top-down방식 - 재귀효율, n의 값이 클수록 오래걸림
		if(dp[n] == null) {
			dp[n] = (tile(n-1) + tile(n-2)) % 15746;
		}
		//bottom-up방식 - 재귀사용안함
		for(int i = 3; i <= n; i++) {
			dp[i] = (dp[i-1] + dp[i-2]) % 15746;
		}
		return dp[n];
	}

}
