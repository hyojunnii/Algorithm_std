package ���Ʈ_����;

import java.util.Scanner;

//��ȭ���� ��
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
