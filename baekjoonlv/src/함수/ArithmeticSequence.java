package ÇÔ¼ö;

import java.util.Scanner;

public class ArithmeticSequence {
	
	public static void seq(int n) {
		int cnt = n;
		if(n > 99) {
			cnt = 99;
			for(int i = 100; i < n+1; i++) {
				int a = i % 10;
				int b = (i % 100 - a) / 10;
				int c = (i - (b*10) - a) / 100;
				
				if((c - b) == (b - a)) {
					cnt++;
				}
			}
		}
		System.out.println(cnt);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		seq(n);
	}
	
}
