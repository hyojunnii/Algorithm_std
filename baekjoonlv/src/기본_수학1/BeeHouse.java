package 기본_수학1;

import java.util.Scanner;

public class BeeHouse {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int cnt = 1;
		int i = 1;
		
		while(n != 1) {
			i += 6*cnt;
			cnt++;
			if(i >= n) {break;}
		}
		
		System.out.println(cnt);
		sc.close();
	}

}
