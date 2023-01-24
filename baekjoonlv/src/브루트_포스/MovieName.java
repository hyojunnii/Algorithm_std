package 브루트_포스;

import java.util.Scanner;

//영화감독 숌
public class MovieName {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int num = 666;
		int cnt = 1;
		while(cnt != n) {
			num++;
			if(Integer.toString(num).contains("666")) {
				cnt++;
			}
		}
		
		System.out.println(num);
		sc.close();
	}

}
