package �ݺ���;

import java.util.Scanner;

public class Sum {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int answer = 0;
		for(int i = 1; i <= n; i++) {
			answer += i;
		}
		
		//�ݺ��� ���� ��������
		answer = n*(n+1)/2;
		
		System.out.println(answer);
		sc.close();
	}

}
