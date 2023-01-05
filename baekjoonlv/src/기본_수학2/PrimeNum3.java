package 기본_수학2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class PrimeNum3 {

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		br.close();
		int m = Integer.parseInt(st.nextToken());
		int n = Integer.parseInt(st.nextToken());
		
		//에라토스테네스의 체
		boolean[] arr = new boolean[n+1];
		arr[0] = true;
		arr[1] = true;
		
		for(int i = 2; i <= Math.sqrt(n); i++) {
			if(arr[i] == true) continue;
			
			//i의 배수 전부 true
			for(int j = 2; i*j <= n; j++) {
				arr[i*j] = true;
			}
		}
		
		StringBuilder sb = new StringBuilder();
		for(int i = m; i <= n; i++) {
			if(arr[i] == false) sb.append(i + "\n");
		}
		
		System.out.println(sb);
	}

}
