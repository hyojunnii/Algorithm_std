package 브루트_포스;

import java.util.Scanner;

public class Decomposition { 

	//분해합
	//n + 각자리수 합
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int answer = 0;
		int sum, num;
		for(int i = 1; i < n; i++) {
			sum = num = i;
			
			//각자리수 더하기
			while(num != 0) {
				sum += num % 10;
				num /= 10;
			}
			
			if(sum == n) {
				answer = i;
				break;
			}
		}
		
		System.out.println(answer);
		sc.close();
	}

}
