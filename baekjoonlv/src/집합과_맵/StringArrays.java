package ���հ�_��;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

//���ڿ� ����
public class StringArrays {

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int n = Integer.parseInt(st.nextToken()); //s ���� ����
		int m = Integer.parseInt(st.nextToken()); //�˻��ؾ��� ����
		int cnt = 0;
		
		//hashset
		HashSet<String> set = new HashSet<String>();
		for(int i = 0; i < n; i++) {
			set.add(br.readLine());
		}
		
		for(int i = 0; i < m; i++) {
			String s = br.readLine();
			if(set.contains(s)) {
				cnt++;
			}
		}
		
		//�迭
//		String[] s = new String[n];
//		for(int i = 0; i < n; i++) {
//			s[i] = br.readLine();
//		}
//		
//		for(int i = 0; i < m; i++) {
//			String str = br.readLine();
//			for(int j = 0; j < n; j++) {
//				if(s[j].equals(str)) {
//					cnt++;
//					continue;
//				}
//			}
//		}
		
		br.close();
		System.out.println(cnt);
	}

}
