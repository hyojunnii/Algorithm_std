package ���;

import java.io.BufferedReader;
import java.io.InputStreamReader;

//�ϳ���ž �̵����� ���ϱ�
public class HanoiTower {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		br.close();
		
		hanoi(n, 1, 2, 3); //���ǰ���, �����, �̵����, ������
		
		System.out.println(cnt);
		System.out.println(sb);
		
	}
	
	public static StringBuilder sb = new StringBuilder();
	public static int cnt = 0;
	
	public static void hanoi(int n, int start, int step, int end) {
		//�̵�Ƚ��
		/*�ϳ���ž ���� : Math.pow(2, n)-1))*/
		cnt++;
		
		//���� 1���� ���Ż��
		if(n == 1) {
			sb.append(start + " " + end + "\n");
			return;
		}
		
		//1. n-1���� A���� B�� �̵�
		hanoi(n-1, start, end, step);
		
		//2. ���� ū 1���� A���� C�� �̵�
		sb.append(start + " " + end + "\n");
		
		//3. ������ n-1���� B���� C�� �̵�
		hanoi(n-1, step, start, end);
	}

}
