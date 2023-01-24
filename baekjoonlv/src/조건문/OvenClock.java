package Á¶°Ç¹®;

import java.util.Scanner;

public class OvenClock {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int h = sc.nextInt();
		int m = sc.nextInt();
		int time = sc.nextInt();
		
		int newh = h + (m+time) / 60;
		if(newh >= 24) {
			newh = newh - 24;
		}
		
		int newm = (m+time)%60;
		
		System.out.println(newh + " " + newm);
		sc.close();
	}

}
