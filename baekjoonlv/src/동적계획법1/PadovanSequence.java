package 동적계획법1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

//파도반 수열
public class PadovanSequence {
	
	//int타입 범위 넘어가므로
	//Long은 객체, long은 자료형
	public static Long[] dp = new Long[101];

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine());

		dp[1] = 1L;
		dp[2] = 1L;
		dp[3] = 1L;
		
		//while --반복문(대문자로해야)
		while(T-- > 0) {
			int N = Integer.parseInt(br.readLine());
			sb.append(P(N)).append('\n');
		}
		
		System.out.println(sb);
		br.close();
	}
	
	public static long P(int n) {
		//top-down
		if(dp[n] == null) {
			dp[n] = P(n-3) + P(n-2);
		}
		
		//bottom-up
//		if(n < 4) return dp[n];
//		for(int i = 4; i <= n; i++) {
//			dp[i] = dp[i-3] + dp[i-2];
//		}
		
		return dp[n];
	}

}
