package �����й����շ�;

import java.util.Scanner;
import java.util.StringTokenizer;

//�ִ������� �ּҰ����
// ��Ŭ���� ȣ���� : GCD(a, b) = GCD(b, ������)
public class GCDAndLCM {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringTokenizer st = new StringTokenizer(sc.nextLine());
		
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
	
		int a = A;
		int b = B;
		while(true) {
			if(a % b == 0) break;
			
			int num = a % b;
			
			a = b;
			b = num;
		}
		
		System.out.println(b);
		System.out.println(A * B / b);
	}
	
}

//�ִ����� : A�� ���, B�� ��� ���ϰ� ������ �� ���� ū ��