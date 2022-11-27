package ¹Ýº¹¹®;

import java.util.Scanner;

public class Receipt {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int n = sc.nextInt();
		int a,b;
		int sum = 0;
		for(int i = 0; i < n; i++) {
			a = sc.nextInt();
			b = sc.nextInt();
			sum += a*b;
		}
		
		if(x == sum) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
		
	}

}
