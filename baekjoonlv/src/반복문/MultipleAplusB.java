package ¹Ýº¹¹®;

import java.util.Scanner;

public class MultipleAplusB {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int rep = sc.nextInt();
		
		int a, b;
		String answer = "";
		for(int i = 0; i < rep; i++) {
			a = sc.nextInt();
			b = sc.nextInt();
			answer += a+b + "\n";
		}
		
		System.out.println(answer);
		
	}

}
