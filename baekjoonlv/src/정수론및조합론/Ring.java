package 정수론및조합론;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//링 - 기약분수
public class Ring {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());

		StringTokenizer st = new StringTokenizer(br.readLine());
		int f = Integer.parseInt(st.nextToken());
		
		int[] arr = new int[n-1];
		for(int i = 0; i < n-1; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		for(int i : arr) {
			int r = gcd(f, i);
			
			sb.append(f / r).append("/").append(i / r).append("\n");
		}
		
		System.out.println(sb);
		br.close();
	}
	
	public static int gcd(int a, int b) {
		while(b != 0) {
			int r = a % b;
			a = b;
			b = r;
		}
		return a;
	}

}
