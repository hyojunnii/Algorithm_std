package 백트래킹;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//스도쿠 - 블로그참고
public class Sudoku {
	
	public static int[][] arr = new int[9][9];

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		for(int i = 0; i < 9; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 0; j < 9; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
	
		sudoku(0,0);
	}
	
	public static void sudoku(int x, int y) {
		if(y == 9) {
			sudoku(x+1, 0);
			return;
		}
		
		if(x == 9) {
			StringBuilder sb = new StringBuilder();
			for(int i = 0; i < 9; i++) {
				for(int j = 0; j < 9; j++) {
					sb.append(arr[i][j]).append(' ');
				}
				sb.append('\n');
			}
			System.out.println(sb);
			System.exit(0);
		}
		
		if(arr[x][y] == 0) {
			for(int i = 1; i <= 9; i++) {
				if(pos(x,y,i)) {
					arr[x][y] = i;
					sudoku(x, y+1);
				}
			}
			arr[x][y] = 0;
			return;
		}
		
		sudoku(x, y+1);
	}
	
	public static boolean pos(int x, int y, int val) {
		for(int i = 0; i < 9; i++) {
			if(arr[x][i] == val) {
				return false;
			}
		}
		
		for(int i = 0; i < 9; i++) {
			if(arr[i][y] == val) {
				return false;
			}
		}
		
		int row = (x / 3) * 3;
		int col = (y / 3) * 3;
		
		for(int i = row; i < row + 3; i++) {
			for(int j = col; j < col + 3; j++) {
				if(arr[i][j] == val) {
					return false;
				}
			}
		}
		
		return true;
	}

}
