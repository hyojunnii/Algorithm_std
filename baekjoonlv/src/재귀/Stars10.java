package ���;

import java.util.Scanner;

public class Stars10 {

	//�����10
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		arr = new char[n][n];
		
		star(0, 0, n, false); //����x, ����y, n, ��ĭ����
		
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				sb.append(arr[i][j]);
			}
			sb.append('\n');
		}
		
		System.out.println(sb);
		sc.close();
	}
	
	static char[][] arr;
	
	public static void star(int x, int y, int n, boolean blank) {
		
		if(blank) {
			for(int i = x; i < x + n; i++) {
				for(int j = y; j < y + n; j++) {
					arr[i][j] = ' ';
				}
			}
			return;
		}
		
		if(n == 1) {
			arr[x][y] = '*';
			return;
		}
		
		int size = n / 3;
		int cnt = 0;
		for(int i = x; i < x+n; i += size) {
			for(int j = y; j < y+n; j += size) {
				cnt++;
				if(cnt == 5) {
					star(i, j, size, true);
				} else {
					star(i, j, size, false);
				}
				System.out.print(x + " " + y);
				System.out.println(" / " + n);
			}
		}
	}
	

}
