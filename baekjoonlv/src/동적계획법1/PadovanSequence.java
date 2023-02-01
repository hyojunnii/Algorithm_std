package ������ȹ��1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

//�ĵ��� ����
public class PadovanSequence {
	
	//intŸ�� ���� �Ѿ�Ƿ�
	//Long�� ��ü, long�� �ڷ���
	public static Long[] dp = new Long[101];

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine());

		dp[1] = 1L;
		dp[2] = 1L;
		dp[3] = 1L;
		
		//while --�ݺ���(�빮�ڷ��ؾ�)
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
