package 기본_수학2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class PrimeNum {

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		String s = br.readLine();
		String[] arr = s.split(" ");
		
		int cnt = 0;
		
		for(int i = 0; i < n; i++) {
			if(primeNum(Integer.parseInt(arr[i]))) {
				cnt++;
			}
		}
		
		System.out.println(cnt);
	}
	
	public static boolean primeNum(int n) {
		if(n < 2) {
			return false;
		}
		
		for(int i = 2; i < n; i++) {
			if(n % i == 0) {
				return false;
			}
		}
		
		return true;
	}

}
