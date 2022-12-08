package �⺻_����1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class AptCase {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		//0�� 1ȣ ~ 14�� 14ȣ
		int[][] apt = new int[15][15];
		//1�� 4ȣ > 0�� 1+2+3+4
		//2�� 4ȣ > 1�� 1+3+6+10
		//3�� 4ȣ > 2�� 1+4+10+20
		//4�� 4ȣ > 3�� 1+5+15+35
		//5�� 4ȣ > 4�� 1+6+21+56
		
		// 0��, 1ȣ ä���
		for(int i = 0; i < 15; i++) {
			apt[0][i] = i;
			apt[i][1] = 1;
		}
		
		// ������ ä��� (����ȣ, �Ʒ�ȣ ���ϱ�)
		for(int a = 1; a < 15; a++) {
			for(int b = 2; b < 15; b++) {
				apt[a][b] = apt[a][b-1] + apt[a-1][b];
			}
		}
		
		int t = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < t; i++) {
			int k = Integer.parseInt(br.readLine()); //k��
			int n = Integer.parseInt(br.readLine()); //nȣ
			
			sb.append(apt[k][n] + "\n");
		}
		
		br.close();
		System.out.println(sb);
	}

}
