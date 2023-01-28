package ������ȹ��;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//���� �ﰢ��
public class IntTriangle {

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int n = Integer.parseInt(br.readLine());
		
		int[][] arr = new int[n][n];
		for(int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 0; j <= i; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		int[][] dp = new int[n][n];
		dp[0][0] = arr[0][0];
	
		for(int i = 1; i < n; i++) {
			//ó��
			dp[i][0] = dp[i-1][0] + arr[i][0];
			
			//�߰�
			for(int j = 1; j < i; j++) {
				dp[i][j] = Math.max(dp[i-1][j], dp[i-1][j-1]) + arr[i][j];
			}
			
			//��
			dp[i][i] = dp[i-1][i-1] + arr[i][i];
		}
		
		int answer = 0;
		for(int i = 0; i < n; i++) {
			answer = Math.max(answer, dp[n-1][i]);
		}
		
		System.out.println(answer);
		br.close();
	}

}
