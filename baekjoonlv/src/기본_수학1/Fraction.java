package 기본_수학1;

import java.util.Scanner;

public class Fraction {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		
		int line = 1;
		int cnt = 0;
		
		//줄 구하기
		while(true) {
			if(cnt + line >= x) {
				break;
			}
			cnt += line;
			line++;
		}
		
		//줄에서 위치 구하기
		int th = x - cnt;
		
		//짝수 홀수 구분
		if(line % 2 == 0) {
			//짝수면 +/-
			System.out.println(th + "/" + (line-th+1));
		} else {
			//홀수면 -/+
			System.out.println((line-th+1)+"/"+th);
		}
		sc.close();
		
//		1     1			  1/1
//		2    3 2        1/2 2/1
//		3   4 5 6	  3/1 2/2 1/3
//		4 10 9 8 7  1/4 2/3 3/2 4/1
		
//		1  2  6  7  15 16 28 29 45 46 66
//		3  5  8  14 17 27 30 44 47 65
//		4  9  13 18 26 31 43 48 64
//		10 12 19 25 32 42 49 63
//		11 20 24 33 41 50 62 
//		21 23 34 40 51 61
//		22 35 39 52 60
//		37 38 53 59
//		37 54 58
//		55 57
//		56
		
//		int col = 1;
//		int row = 1;
//		int maxnum = 1;
//		int i = 1;
//		
		//다음 1열값 구하기
//		while(true) {
//			if(maxnum >= x) { 
//				break;
//			}
//			col++;
//			if(col % 2 == 0) {
//				maxnum++;
//			} else {
//				maxnum += 4*i;
//				i++;
//			}
//		}
//		
		//값 찾을때까지 -
//		boolean rowcheck = true;
//		boolean colcheck = true;
//		while(maxnum - x > 0) {
//			if(rowcheck) {
//				col--;
//				row++;
//				if(col == 1) {
//					rowcheck = false;
//				}
//			} else {
//				if(colcheck) {
//					col--;
//					colcheck = false;
//				}
//				col++;
//				row--;
//			}
//			maxnum--;
//		}
//		
//		System.out.println(row + "/" + col);
		
	}   

}
