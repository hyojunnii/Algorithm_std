package ��Ʈ��ŷ;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class NQueen {
	
	public static int[] queen;
	public static int N;
	public static int cnt = 0;

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		queen = new int[N];
		nQueen(0);
		
		System.out.println(cnt);
		br.close();
	}
	
	public static void nQueen(int idx) {
		if(idx == N) {
			cnt++;
			return;
		}
		
		for(int i = 0; i < N; i++) {
			queen[idx] = i;
			//�ش翭 i�࿡ �� ������������
			if(col(idx)) {
				//���� �� �Ѿ��
				nQueen(idx+1);
			}
		}
	}
	
	public static boolean col(int idx) {
		for(int i = 0; i < idx; i++) {
			//���� ���� ���
			if(queen[idx] == queen[i]) return false;
			//�밢���� ���
			//������ == ������
			else if(Math.abs(idx-i) == Math.abs(queen[idx] - queen[i])) return false;
		}
		return true;
	}

}
