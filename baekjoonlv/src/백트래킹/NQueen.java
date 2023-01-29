package 백트래킹;

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
			//해당열 i행에 퀸 놓을수있으면
			if(col(idx)) {
				//다음 열 넘어가기
				nQueen(idx+1);
			}
		}
	}
	
	public static boolean col(int idx) {
		for(int i = 0; i < idx; i++) {
			//같은 행일 경우
			if(queen[idx] == queen[i]) return false;
			//대각선일 경우
			//열의차 == 행의차
			else if(Math.abs(idx-i) == Math.abs(queen[idx] - queen[i])) return false;
		}
		return true;
	}

}
