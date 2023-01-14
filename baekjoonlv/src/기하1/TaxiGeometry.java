package 기하1;

import java.util.Scanner;

//택시 기하학, 유클리드 기하학
// 유클리드 기하학 - 둥근원
// 택시 기하학(맨해튼 거리) - 원:45도 기울어진 정사각형
public class TaxiGeometry {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		
		//유클리드원 넓이 = r2 * 파이
		System.out.println(Math.pow(r, 2)*Math.PI);
		//맨해튼거리원 넓이 = r2 * 2
		System.out.println(2*Math.pow(r,2));
	}

}
