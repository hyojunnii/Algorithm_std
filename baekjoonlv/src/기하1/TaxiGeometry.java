package ����1;

import java.util.Scanner;

//�ý� ������, ��Ŭ���� ������
// ��Ŭ���� ������ - �ձٿ�
// �ý� ������(����ư �Ÿ�) - ��:45�� ������ ���簢��
public class TaxiGeometry {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		
		//��Ŭ����� ���� = r2 * ����
		System.out.println(Math.pow(r, 2)*Math.PI);
		//����ư�Ÿ��� ���� = r2 * 2
		System.out.println(2*Math.pow(r,2));
	}

}
