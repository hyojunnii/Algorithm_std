package ���;

import java.util.Scanner;

public class Fibonacci5 {

	//�Ǻ���ġ����
	public static void main(String[] args) {

		Scanner sc = new  Scanner(System.in);
		int n = sc.nextInt();
		
		int answer = fibonacci(n);
		System.out.println(answer);
	}

	private static int fibonacci(int n) {
		if(n < 2) {
			return n;
		} else {
			// ���� + ������
			return fibonacci(n-1) + fibonacci(n-2);
		}
	}

}
