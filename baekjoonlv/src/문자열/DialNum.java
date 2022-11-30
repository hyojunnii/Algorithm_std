package ¹®ÀÚ¿­;

import java.util.Scanner;

public class DialNum {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();

		char[] arr = str.toCharArray();
		
		int time = 0;
		for(char c : arr) {
			
			if(c < 'D') {time += 3;
			} else if (c < 'G') {time += 4;
			} else if (c < 'J') {time += 5;
			} else if (c < 'M') {time += 6;
			} else if (c < 'P') {time += 7;
			} else if (c < 'T') {time += 8;
			} else if (c < 'W') {time += 9;
			} else if (c <= 'Z') {time += 10;
			} else {time += 2;}
		}
		
		System.out.println(time);
	}

}
