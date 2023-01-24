package 입출력과_사칙연산;

import java.util.Scanner;

public class Multiple {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		int a = num2 % 10;
		int b = (num2 % 100 - a) / 10;
		int c = (num2 % 1000 - b - a) / 100;
		
		System.out.println(num1 * a);
		System.out.println(num1 * b);
		System.out.println(num1 * c);
		System.out.println(num1 * num2);
		sc.close();
	}

}
