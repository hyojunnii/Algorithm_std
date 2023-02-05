package ������;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//�ΰ�-��ǻ�� ��ȣ�ۿ� - ��α�����
public class HumanComputer {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		String s = br.readLine(); //���ڿ�
		int q = Integer.parseInt(br.readLine()); //������
		
		//��ü ������ ���ϱ�
		int[][] arr = new int[s.length()][26];
		arr[0][s.charAt(0)-'a']++;
		for(int i = 1; i < s.length(); i++) {
			//���� ������ ����
			for(int j = 0; j < 26; j++) {
				arr[i][j] = arr[i-1][j];
			}
			//������ �߰�
			int idx = s.charAt(i)-'a';
			arr[i][idx]++;
		}
		
		StringTokenizer st;
		for(int t = 0; t < q; t++) {
			st = new StringTokenizer(br.readLine());
			int a = st.nextToken().charAt(0)-'a'; //ã������
			int l = Integer.parseInt(st.nextToken()); //������ġ
			int r = Integer.parseInt(st.nextToken()); //����ġ
			
			if(l == 0) sb.append(arr[r][a]).append('\n');
			else sb.append(arr[r][a] - arr[l-1][a]).append('\n');
		}

		System.out.println(sb);
		br.close();
	}

}
