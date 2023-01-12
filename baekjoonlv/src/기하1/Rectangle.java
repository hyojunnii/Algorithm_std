package ����1;

import java.util.Scanner;
import java.util.StringTokenizer;

//���簢�� Ż���ϱ�
public class Rectangle {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		StringTokenizer st = new StringTokenizer(sc.nextLine());
		
		int x = Integer.parseInt(st.nextToken());
		int y = Integer.parseInt(st.nextToken());
		int w = Integer.parseInt(st.nextToken());
		int h = Integer.parseInt(st.nextToken());

		int dist = Math.min(w-x, h-y);
		
		if(x > y) {
			System.out.println(Math.min(dist, y));
		} else {
			System.out.println(Math.min(dist, x));
		}
		
	}

}
