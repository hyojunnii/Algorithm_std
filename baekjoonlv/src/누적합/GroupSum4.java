package ������;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//���� �� ���ϱ� 4
// �����̵� ������ �˰��� �̿�
public class GroupSum4 {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken()); //����
		int m = Integer.parseInt(st.nextToken()); //Ƚ��
		
		int[] arr = new int[n+1];
		arr[0] = 0;
		st = new StringTokenizer(br.readLine());
		//������ �ֱ�
		for(int i = 1; i <= n; i++) {
			arr[i] = Integer.parseInt(st.nextToken()) + arr[i-1];
		}
		
		for(int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			//ū�տ��� �������� �պκ� ��λ���
			sb.append(arr[b]-arr[a-1]).append('\n');
		}
		
		System.out.println(sb);
		br.close();
	}

}
