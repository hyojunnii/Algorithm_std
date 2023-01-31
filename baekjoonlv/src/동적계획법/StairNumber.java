package ������ȹ��;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

//���� ��� ��
public class StairNumber {
	
	public static long[][] dp;
	public final static long mod = 1000000000;

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		dp = new long[N+1][10];
		
		//ù�ڸ��� ������ �Ѱ�
		for(int i = 1; i < 10; i++) {
			dp[1][i] = 1;
		}
		
		//�ι�°�ڸ������� N����
		for(int i = 2; i <= N; i++) {
			for(int j = 0; j < 10; j++) {
				//0�̸� �����ڸ��� 1�ڸ��� ����
				if(j == 0) dp[i][0] = dp[i-1][1] % mod;
				//9�� �����ڸ��� 8�ڸ��� ����
				else if(j == 9) dp[i][9] = dp[i-1][8] % mod;
				//�̿��� ��� �����ڸ��� -1, +1�ڸ�
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
