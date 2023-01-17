package 정수론및조합론;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//다리 놓기
// 겹치지 않기 - 순서없는 조합(nCr)이용 -> 134 314 같은거로 본다
public class Bridge {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		int t = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < t; i++) {
			st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken()); //서쪽
			int m = Integer.parseInt(st.nextToken()); //동쪽
			
			//mCn 구하기 - 동쪽 m개에서 서쪽 n개 뽑기
			sb.append(combi(m, n)).append("\n");
		}
		
		System.out.println(sb);
		br.close();
	}
	
	public static int[][] memo = new int[30][30];
	
	public static int combi(int n, int r) {
		if(memo[n][r] > 0) {
			return memo[n][r];
		}
		
		if(n == r || r == 0) {
			return memo[n][r] = 1;
		}
		
		return memo[n][r] = combi(n-1, r-1) + combi(n-1, r);
	}

}
