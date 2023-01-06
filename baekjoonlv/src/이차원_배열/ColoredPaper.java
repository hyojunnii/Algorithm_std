package 이차원_배열;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ColoredPaper {

	//색종이
	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		boolean[][] paper = new boolean[100][100];
		
		int c = Integer.parseInt(br.readLine());
		int cnt = 0;
		
		for(int t = 0; t < c; t++) {
			st = new StringTokenizer(br.readLine());
			int row = Integer.parseInt(st.nextToken());
			int col = Integer.parseInt(st.nextToken());
			
			for(int i = row-1; i < row+9; i++) {
				for(int j = col-1; j < col+9; j++) {
					if(paper[i][j]) continue;
					paper[i][j] = true;
					cnt++;
				}
			}
		}
		
		System.out.println(cnt);
	}

}
