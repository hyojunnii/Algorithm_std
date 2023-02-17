package 이분탐색;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

//수 찾기
public class FindNumber {
	
	public static int[] A;
	
	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
		A = new int[n];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n; i++) {
			A[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(A);
		
		int m = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < m; i++) {
			sb.append(bs(Integer.parseInt(st.nextToken()), 0, n-1)).append('\n');
		}
		
		System.out.println(sb);
		br.close();
	}
	
	public static int bs(int num, int start, int end) {
		int mid;
		//재귀
		if(start <= end) {
			mid = (end+start)/2;
			
			if(A[mid] == num) {
				return 1;
			}
			else if(A[mid] > num) {
				return bs(num, start, mid-1);
			}
			else {
				return bs(num, mid+1, end);
			}
		}
		
		//반복문
		while(start <= end) {
			mid = (start+end)/2;
			
			if(num == A[mid]) {
				return 1;
			}
			else if(num < A[mid]) {
				end = mid-1;
			}
			else {
				start = mid+1;
			}
		}
		
		return 0;
	}
	
}
