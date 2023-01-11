package 브루트_포스;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//체스판 다시 칠하기
public class Chess {
	
	public static boolean[][] arr;

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		arr = new boolean[n][m];
		
		for(int i = 0; i < n; i++) {
			String str = br.readLine();
			
			for(int j = 0; j < m; j++) {
				if(str.charAt(j) == 'W') {
					arr[i][j] = true;
				} else {
					arr[i][j] = false;
				}
			}
		}
		
		int answer = 64;
		for(int i = 0; i < n-7; i++) {
			for(int j = 0; j < m-7; j++) {
				int result = chess(i, j);
				if(result < answer) {
					answer = result;
				}
			}
		}
		
		System.out.println(answer);
		
	}
	
	public static int chess(int x, int y) {
		boolean color = arr[x][y];
		
		int cnt = 0;
		for(int i = x; i < x+8; i++) {
			for(int j = y; j < y+8; j++) {
				if(arr[i][j] != color) {
					cnt++;
				}
				color = !color;
			}
			color = !color;
		}
		
		//색 반대인경우도 고려
		cnt = Math.min(cnt, 64 - cnt);
		
		return cnt;
	}

}
