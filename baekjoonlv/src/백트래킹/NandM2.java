package 백트래킹;

import java.util.Scanner;
import java.util.StringTokenizer;

//N과 M 2
// 중복없이 -> 앞번호로 돌아가지 않음
public class NandM2 {
	
	static int n,m;
	static StringBuilder sb = new StringBuilder();
	static int[] arr;

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		StringTokenizer st = new StringTokenizer(sc.nextLine());
		
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		arr = new int[m];
		
		dfs(1, 0); //시작값, 깊이
		System.out.println(sb);
		
	}
	
	public static void dfs(int at, int dept) {
		if(dept == m) {
			for(int num : arr) {
				sb.append(num).append(" ");
			}
			sb.append("\n");
			return;
		}
		
		for(int i = at; i <= n; i++) {
			arr[dept] = i; //현재 깊이에 i
			dfs(i+1, dept+1); //다음 깊이 호출, 현재값보다 무조건 커야
		}
	}

}
