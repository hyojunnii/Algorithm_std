package 누적합;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//수열
// 3가지 방식 - https://nahwasa.com/entry/%EC%9E%90%EB%B0%94-%EB%B0%B1%EC%A4%80-2559-%EC%88%98%EC%97%B4-boj-java
// 1. 누적합
// 2. 슬라이딩윈도우
// 3. 투포인터
public class Sequence {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int n = Integer.parseInt(st.nextToken()); //갯수
		int k = Integer.parseInt(st.nextToken()); //연속일수
		
		int[] arr = new int[n];
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		int max = Integer.MIN_VALUE;
		for(int i = 0; i <= n-k; i++) {
			int sum = 0;
			for(int j = i; j < i+k; j++) {
				sum += arr[j];
			}
			max = Math.max(max, sum);
		}
		
		System.out.println(max);
		br.close();
	}

}
