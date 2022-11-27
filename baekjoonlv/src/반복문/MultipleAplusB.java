package ¹Ýº¹¹®;

import java.util.Scanner;

public class MultipleAplusB {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int rep = sc.nextInt();
		
		int a, b;
		String answer = "";
		int cnt = 0;
		while(cnt < rep) {
			a = sc.nextInt();
			b = sc.nextInt();
			cnt++;
			answer += a+b + "\n";
		}
		
		System.out.println(answer);
		
	}

}
