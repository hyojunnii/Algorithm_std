package �⺻_����1;

import java.util.Scanner;
import java.util.StringTokenizer;

public class BEpoint {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String s = sc.nextLine();
		StringTokenizer st = new StringTokenizer(s);
		
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());
		
		// b <= c�� ���ͺб��� x
		// a + bx < cx => a/(c-b) < x
		int cnt = 0;
		if(c <= b) {
			cnt = -1;
		} else {
			cnt = a / (c-b) + 1;
		}
		
		System.out.println(cnt);
		
	}

}
