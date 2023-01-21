package ��Ʈ��ŷ;

import java.util.Scanner;
import java.util.StringTokenizer;

//N�� M 2
// �ߺ����� -> �չ�ȣ�� ���ư��� ����
public class NandM2 {
	
	static int n,m;
	static StringBuilder sb = new StringBuilder();
	static int[] arr;

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		StringTokenizer st = new StringTokenizer(sc.nextLine());
		
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		arr = new int[m];
		
		dfs(1, 0); //���۰�, ����
		System.out.println(sb);
		
	}
	
	public static void dfs(int at, int dept) {
		if(dept == m) {
			for(int num : arr) {
				sb.append(num).append(" ");
			}
			sb.append("\n");
			return;
		}
		
		for(int i = at; i <= n; i++) {
			arr[dept] = i; //���� ���̿� i
			dfs(i+1, dept+1); //���� ���� ȣ��, ���簪���� ������ Ŀ��
		}
	}

}
