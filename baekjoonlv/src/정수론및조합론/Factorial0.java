package �����й����շ�;

import java.util.Scanner;

//���丮�� 0�� ���� ���ϱ� - ��α�����
// = 10(2,5)�� �󸶳� ������ �ִ���
// 98000 = 98 * 10^3
// 2 > 5�ǹ���� ������ 5�� ����� ���� 10�� ��� ����
public class Factorial0 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int cnt = 0;
		while(n >= 5) {
			cnt += n / 5;
			n /= 5;
		}
		
		System.out.println(cnt);
	}
	
}
