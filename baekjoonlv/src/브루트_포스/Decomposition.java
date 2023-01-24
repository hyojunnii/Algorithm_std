package ���Ʈ_����;

import java.util.Scanner;

public class Decomposition { 

	//������
	//n + ���ڸ��� ��
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int answer = 0;
		int sum, num;
		for(int i = 1; i < n; i++) {
			sum = num = i;
			
			//���ڸ��� ���ϱ�
			while(num != 0) {
				sum += num % 10;
				num /= 10;
			}
			
			if(sum == n) {
				answer = i;
				break;
			}
		}
		
		System.out.println(answer);
		sc.close();
	}

}
