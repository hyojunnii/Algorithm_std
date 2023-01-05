package 기본_수학2;

import java.util.Scanner;

public class PrimeFactorization {

	//소인수분해
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		StringBuilder sb = new StringBuilder();
		
		if(n > 1) {
			for(int i = 2; i <= n; i++) {
				while(n % i == 0) {
					sb.append(i + "\n");
					n /= i;
				}
			}
		}
		
		System.out.println(sb);
		
	}

}
