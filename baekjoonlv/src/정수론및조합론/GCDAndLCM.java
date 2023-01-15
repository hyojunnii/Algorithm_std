package 정수론및조합론;

import java.util.Scanner;
import java.util.StringTokenizer;

//최대공약수와 최소공배수
// 유클리드 호제법 : GCD(a, b) = GCD(b, 나머지)
public class GCDAndLCM {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringTokenizer st = new StringTokenizer(sc.nextLine());
		
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
	
		int a = A;
		int b = B;
		while(true) {
			if(a % b == 0) break;
			
			int num = a % b;
			
			a = b;
			b = num;
		}
		
		System.out.println(b);
		System.out.println(A * B / b);
	}
	
}

//최대공약수 : A의 약수, B의 약수 구하고 공통약수 중 가장 큰 수