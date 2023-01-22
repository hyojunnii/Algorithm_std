package ����1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//�����
// �ٸ� �������� ���鼭 �༺�� �ּ� ����, ��Ż Ƚ��
// ������� �������� �� �� �ȿ� ���ϴ� �� �Ǵ�
public class LittlePrince {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
	
		int t = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < t; i++) {
			//�����, ������
			st = new StringTokenizer(br.readLine());
			int x1 = Integer.parseInt(st.nextToken());
			int y1 = Integer.parseInt(st.nextToken());
			int x2 = Integer.parseInt(st.nextToken());
			int y2 = Integer.parseInt(st.nextToken());
			
			//�༺�� ����
			int n = Integer.parseInt(br.readLine());
			
			int cnt = 0; //����Ƚ��
			for(int j = 0; j < n; j++) {
				boolean start = false;
				boolean end = false;
				
				st = new StringTokenizer(br.readLine());
				int c1 = Integer.parseInt(st.nextToken());
				int c2 = Integer.parseInt(st.nextToken());
				int r = Integer.parseInt(st.nextToken());
				
				//�����, �������� �� �ȿ� �ִ��� �Ǵ�
				//���� : (x2-x1)^2 + (y2-y1)^2 <= r^2
				if(Math.pow(x1 - c1, 2) + Math.pow(y1 - c2, 2) <= Math.pow(r, 2)) {
					start = true;
					cnt++;
				}
				if(Math.pow(x2 - c1, 2) + Math.pow(y2 - c2, 2) <= Math.pow(r, 2)) {
					end = true;
					cnt++;
				}
				//�ѿ� �ȿ� ���ÿ� ���ϴ� ���
				if(start && end) cnt -= 2;
			}
			
			sb.append(cnt).append('\n');
		}
		
		System.out.println(sb);
		br.close();
	}

}
