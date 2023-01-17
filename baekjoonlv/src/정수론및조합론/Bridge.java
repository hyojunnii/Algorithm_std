package �����й����շ�;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//�ٸ� ����
// ��ġ�� �ʱ� - �������� ����(nCr)�̿� -> 134 314 �����ŷ� ����
public class Bridge {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		int t = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < t; i++) {
			st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken()); //����
			int m = Integer.parseInt(st.nextToken()); //����
			
			//mCn ���ϱ� - ���� m������ ���� n�� �̱�
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
