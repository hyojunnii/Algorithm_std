package ��Ʈ��ŷ;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//��ŸƮ�� ��ũ
public class StartAndLink {
	
	public static int N;
	public static int min = Integer.MAX_VALUE;
	public static int[][] arr;
	public static boolean[] visit;

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		N = Integer.parseInt(br.readLine());

		arr = new int[N][N];
		visit = new boolean[N];
		for(int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 0; j < N; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		team(0, 0);
		
		System.out.println(min);
		br.close();
	}
	
	public static void team(int idx, int cnt) {
		//���տϼ��Ǹ� �����ϱ�
		if(cnt == N / 2) {
			int start = 0;
			int link = 0;
			
			//������� �Ȼ̰�
			for(int i = 0; i < N-1; i++) {
				for(int j = i+1; j < N; j++) {
					if(visit[i] && visit[j]) {
						start += arr[i][j];
						start += arr[j][i];
					}
					else if(!visit[i] && !visit[j]) {
						link += arr[i][j];
						link += arr[j][i];
					}
				}
			}
			
			int val = Math.abs(start - link);
			min = Math.min(min, val);
			return;
		}
		
		//���� ����� �ݺ���
		for(int i = idx; i < N; i++) {
			if(!visit[i]) {
				visit[i] = true;
				team(i+1, cnt+1);
				visit[i] = false;
			}
		}
	}

}
