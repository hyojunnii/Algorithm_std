package 백트래킹;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//N과 M 4
// 같은 수 여러번 가능, 중복없이 비내림차순(수열내내림차순)
public class NandM4 {
	
	public static int n,m;
	public static int[] arr;
	public static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		
		arr = new int[m];
		dfs(1, 0); //시작값, 깊이
		System.out.println(sb);
		br.close();
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
			arr[dept] = i;
			dfs(i, dept+1);
		}
		
	}

}
