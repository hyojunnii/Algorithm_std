package Àç±Í;

import java.util.Scanner;

public class Factorial {

	//ÆÑÅä¸®¾ó - 1¿¡¼­ n±îÁö °ö
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int answer = factorial(n);
		System.out.println(answer);
		sc.close();
	}
	
	public static int factorial(int n) {
		if(n == 0) {
			return 1;
		} else {
			return n * factorial(n-1);
		}
	}

}
