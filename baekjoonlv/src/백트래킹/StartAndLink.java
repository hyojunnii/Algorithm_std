package 백트래킹;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//스타트와 링크
public class StartAndLink {
	
	public static int N;
	public static int min = Integer.MAX_VALUE;
	public static int[][] arr;
	public static boolean[] visit;

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		N = Integer.parseInt(br.readLine());

		arr = new int[N][N];
		visit = new boolean[N];
		for(int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 0; j < N; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		team(0, 0);
		
		System.out.println(min);
		br.close();
	}
	
	public static void team(int idx, int cnt) {
		//조합완성되면 값구하기
		if(cnt == N / 2) {
			int start = 0;
			int link = 0;
			
			//같은사람 안뽑게
			for(int i = 0; i < N-1; i++) {
				for(int j = i+1; j < N; j++) {
					if(visit[i] && visit[j]) {
						start += arr[i][j];
						start += arr[j][i];
					}
					else if(!visit[i] && !visit[j]) {
						link += arr[i][j];
						link += arr[j][i];
					}
				}
			}
			
			int val = Math.abs(start - link);
			min = Math.min(min, val);
			return;
		}
		
		//조합 만드는 반복문
		for(int i = idx; i < N; i++) {
			if(!visit[i]) {
				visit[i] = true;
				team(i+1, cnt+1);
				visit[i] = false;
			}
		}
	}

}
