package ��Ʈ��ŷ;

import java.util.Scanner;
import java.util.StringTokenizer;

//N�� M 1
// ��Ʈ��ŷ - DFS(���̿켱Ž��)
public class NandM1 {
	
	static int[] arr;
	static boolean[] visit;
	static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringTokenizer st = new StringTokenizer(sc.nextLine());
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
	
		arr = new int[m];
		visit = new boolean[n];
		
		dfs(n,m,0);
		
		System.out.println(sb);
	}
	
	public static void dfs(int n, int m, int dep) {
		//��� ���� �������� ���
		if(dep == m) {
			for(int num : arr) {
				sb.append(num).append(" ");
			}
			sb.append("\n");
			return;
		}
		
		for(int i = 0; i < n; i++) {
			//��� �湮 ���ߴٸ�
			if(!visit[i]) {
				visit[i] = true;
				arr[dep] = i+1;
				//���� �ڽĳ�� �湮
				dfs(n, m, dep+1);
				
				//�ڽĳ�� �湮������ �湮���� ���·� ����
				visit[i] = false;
			}
		}
		return;
	}
	
}
