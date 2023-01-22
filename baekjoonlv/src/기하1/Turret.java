package ����1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//�ͷ� - ��α�����
// �� ���� ���� ���ϱ�
public class Turret {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		int t = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < t; i++) {
			st = new StringTokenizer(br.readLine());
			int x1 = Integer.parseInt(st.nextToken());
			int y1 = Integer.parseInt(st.nextToken());
			int r1 = Integer.parseInt(st.nextToken());
			
			int x2 = Integer.parseInt(st.nextToken());
			int y2 = Integer.parseInt(st.nextToken());
			int r2 = Integer.parseInt(st.nextToken());
			
			int result = turret(x1, y1, r1, x2, y2, r2);
			sb.append(result).append("\n");
		}
		
		System.out.println(sb);
		br.close();
	}
	
	public static int turret(int x1, int y1, int r1, int x2, int y2, int r2) {
		
		//�������� �Ÿ� : ((x2-x1)^2 + (y2-y1)^2))^1/2
		double dist = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
		
		int sum = r1 + r2;
		int sub = Math.abs(r1 - r2);
		
		//case1 : ���������鼭 ������ ���� (�������Ѵ�)
		if(dist == 0 && r1 == r2) {
			return -1;
		}
		
		//case2-1 : �������ִ� �� �� (������ �Ÿ��� ������ �պ��� ��)
		else if(dist > sum) {
			return 0;
		}
		
		//case2-2 : �������� �ʴ� ���ȿ� �� (������ �Ÿ��� ������ ���̺��� ª��)
		else if(dist < sub) {
			return 0;
		}
		
		//case3-1 : ���� (������ �Ÿ��� ������ ���̰� ��ġ)
		else if(dist == sub) {
			return 1;
		}
		
		//case3-2 : ���� (������ �Ÿ��� ������ �հ� ��ġ)
		else if(dist == sum) {
			return 1;
		}
		
		//�������� ���� 2�� (������ ��ġ�� ���)
		return 2;
	}

}
