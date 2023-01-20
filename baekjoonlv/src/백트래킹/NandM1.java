package 백트래킹;

import java.util.Scanner;
import java.util.StringTokenizer;

//N과 M 1
// 백트래킹 - DFS(깊이우선탐색)
public class NandM1 {
	
	static int[] arr;
	static boolean[] visit;
	static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringTokenizer st = new StringTokenizer(sc.nextLine());
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
	
		arr = new int[m];
		visit = new boolean[n];
		
		dfs(n,m,0);
		
		System.out.println(sb);
	}
	
	public static void dfs(int n, int m, int dep) {
		//재귀 깊이 같아지면 출력
		if(dep == m) {
			for(int num : arr) {
				sb.append(num).append(" ");
			}
			sb.append("\n");
			return;
		}
		
		for(int i = 0; i < n; i++) {
			//노드 방문 안했다면
			if(!visit[i]) {
				visit[i] = true;
				arr[dep] = i+1;
				//다음 자식노드 방문
				dfs(n, m, dep+1);
				
				//자식노드 방문끝나면 방문안한 상태로 변경
				visit[i] = false;
			}
		}
		return;
	}
	
}
