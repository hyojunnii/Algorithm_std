package Á¶°Ç¹®;

import java.util.Scanner;

public class AlertClock {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int h = sc.nextInt();
		int m = sc.nextInt();
		
		if(m-45 < 0) {
			h = h-1;
		}
		if(h < 0) {
			h = 23;
		}
		
		m = 60-(45-m);
		if(m >= 60) {
			m = m - 60;
		}

		System.out.println(h + " " + m);
		sc.close();
	}

}
