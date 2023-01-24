package 기본_수학1;

import java.util.Scanner;

public class SugarDeliver {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//3kg 5kg 조합
		int n = sc.nextInt(); //Nkg
		
		if(n == 4 || n == 7) {
			System.out.println(-1);
			
		} else if (n % 5 == 0) {
			System.out.println(n / 5);
			
		} else if (n % 5 == 3 || n % 5 == 1) {
			System.out.println(n / 5 + 1);
			
		} else if (n % 5 == 4 || n % 5 == 2) {
			System.out.println(n / 5 + 2);
		}
		sc.close();
		
		//*반복문..
//		int three = 0;
//		int five = 0;
//		
//		int num = n;
//		while(num >= 5) {
//			num -= 5;
//			five++;
//		}
//		
//		while(true) {
//			if(num % 3 != 0) {
//				num += 5;
//				five--;
//				if(num > n) {
//					System.out.println(-1);
//					break;
//				}
//			} else {
//				three = num / 3;
//				System.out.println(three + five);
//				break;
//			}
//		}
		
	}

}
