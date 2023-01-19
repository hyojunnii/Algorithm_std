package 정수론및조합론;

import java.util.Scanner;

//팩토리얼 0의 개수 구하기 - 블로그참고
// = 10(2,5)이 얼마나 곱해져 있는지
// 98000 = 98 * 10^3
// 2 > 5의배수기 때문에 5의 배수를 세면 10의 배수 개수
public class Factorial0 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int cnt = 0;
		while(n >= 5) {
			cnt += n / 5;
			n /= 5;
		}
		
		System.out.println(cnt);
	}
	
}
