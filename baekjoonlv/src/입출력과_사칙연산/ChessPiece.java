package 입출력과_사칙연산;

import java.util.Scanner;

public class ChessPiece {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int king = sc.nextInt();
		int queen = sc.nextInt();
		int look = sc.nextInt();
		int bishop = sc.nextInt();
		int knight = sc.nextInt();
		int phon = sc.nextInt();
		
		System.out.print(1-king + " ");
		System.out.print(1-queen + " ");
		System.out.print(2-look + " ");
		System.out.print(2-bishop + " ");
		System.out.print(2-knight + " ");
		System.out.print(8-phon);
		sc.close();
	}

}
