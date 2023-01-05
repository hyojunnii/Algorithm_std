package 기본_수학2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class PrimeNum2 {

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int m = Integer.parseInt(br.readLine());
		int n = Integer.parseInt(br.readLine());
		br.close();
		
		int sum = 0;
		int min = 0;
		
		for(int i = m; i <= n; i++) {
			if(primeNum(i)) {
				sum += i;
				if(min == 0) {
					min = i;
				}
			}
		}
		
		if(sum == 0) {
			System.out.println(-1);
		} else {
			System.out.println(sum);
			System.out.println(min);
		}
		
	}
	
	public static boolean primeNum(int m) {
		if(m < 2) {
			return false;
		}
		
		for(int i = 2; i < m; i++) {
			if(m % i == 0) {
				return false;
			}
		}
		
		return true;
	}

}
