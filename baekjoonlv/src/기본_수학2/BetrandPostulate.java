package 기본_수학2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BetrandPostulate {

	//베르트랑 공준
	// 자연수 n보다 크고 2n보다 작거나 같은 소수는 적어도 하나 존재함
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		while(true) {
			int n = Integer.parseInt(br.readLine());
			if(n == 0) break;
			
			boolean[] arr = new boolean[2*n+1];
			arr[0] = true;
			arr[1] = true;
			
			for(int i = 2; i <= Math.sqrt(2*n); i++) {
				if(arr[i] == true) continue;
				
				//i의 배수 전부 true
				for(int j = 2; i*j <= 2*n; j++) {
					arr[i*j] = true;
				}
			}
			
			int cnt = 0;
			for(int i = n+1; i <= 2*n; i++) {
				if(arr[i] == false) cnt++;
			}
			
			sb.append(cnt + "\n");
		}
		br.close();
		System.out.println(sb);
		
	}

}
