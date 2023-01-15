package 정수론및조합론;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

//검문
// if 6/m+r = 32/m+r = 36/m+r
// (6 - 34) / M = (34 - 38) / M
// M = (6-34), (34-38)의 최대공약수의 약수들
public class Inspection {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
		
		int[] arr = new int[n];
		for(int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		Arrays.sort(arr);
		
		int val = arr[1] - arr[0];
		
		for(int i = 2; i < n; i++) {
			val = gcd(val, arr[i] - arr[i-1]);
		}
		
		for(int i = 2; i <= val; i++) {
			if(val % i == 0) {
				sb.append(i).append(" ");
			}
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
