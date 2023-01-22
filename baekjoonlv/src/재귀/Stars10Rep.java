package ���;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Stars10Rep {

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		
		arr = new char[n][n];
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				arr[i][j] = ' ';
			}
		}
		
		star(0,0,n);
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				sb.append(arr[i][j]);
			}
			sb.append('\n');
		}
		
		System.out.println(sb);
		br.close();
	}
	
	public static char[][] arr;
	
	public static void star(int x, int y, int n) {
		
		//���ɰ���������
		if(n == 1) {
			arr[x][y] = '*';
			return;
		}
		
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				// 5��° ĭ (1,1)�� ����
				if(!(i==1 && j==1)) {
					// n/3���� �ɰ��鼭 ���ȣ��
					star(x + i * (n/3), y + j * (n/3), n/3);
				}
			}
		}
		
	}

}
