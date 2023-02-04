package 누적합;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//구간 합 구하기 4
// 슬라이딩 윈도우 알고리즘 이용
public class GroupSum4 {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken()); //갯수
		int m = Integer.parseInt(st.nextToken()); //횟수
		
		int[] arr = new int[n+1];
		arr[0] = 0;
		st = new StringTokenizer(br.readLine());
		//누적합 넣기
		for(int i = 1; i <= n; i++) {
			arr[i] = Integer.parseInt(st.nextToken()) + arr[i-1];
		}
		
		for(int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			//큰합에서 작은합의 앞부분 모두빼기
			sb.append(arr[b]-arr[a-1]).append('\n');
		}
		
		System.out.println(sb);
		br.close();
	}

}
