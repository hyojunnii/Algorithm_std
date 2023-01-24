package Á¶°Ç¹®;

import java.util.Scanner;

public class ThreeDice {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int award = 0;
		
		if(a == b && a == c) {
			award = 10000 + a*1000;
		} else if(a==b || a==c) {
			award = 1000 + a*100;
		} else if(b==c) {
			award = 1000 + b*100;
		} else {
			award = Math.max(Math.max(a, b), c) * 100;
		}
		
		System.out.println(award);
		sc.close();
	}

}
