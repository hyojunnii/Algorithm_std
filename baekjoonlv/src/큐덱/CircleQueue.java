package ť��;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

//ȸ���ϴ� ť
public class CircleQueue {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());

		//idxã������ LinkedList
		LinkedList<Integer> que = new LinkedList<Integer>(); 
		for(int i = 1; i <= n; i++) {
			que.offer(i);
		}
		
		st = new StringTokenizer(br.readLine());
		int[] arr = new int[m];
		for(int i = 0; i < m; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		int cnt = 0;
		for(int i = 0; i < m; i++) {
			if(arr[i] == que.peekFirst()) {
				que.pollFirst();
				continue;
			}
			
			//��ġ ���ϱ�
			int idx = que.indexOf(arr[i]);
			//�߰���ġ
			int half;
			if(que.size() % 2 == 0) {
				half = que.size() / 2 - 1;
			} else {
				half = que.size() / 2;
			}
			
			if(idx <= half) {
				//idx���� �� �ڷ� ������
				for(int j = 0; j < idx; j++) {
					que.offerLast(que.pollFirst());
					cnt++;
				}
			}
			else {
				//�ڿ��� idx���� ������ ��������
				for(int j = 0; j < que.size() - idx; j++) {
					que.offerFirst(que.pollLast());
					cnt++;
				}
			}
			que.pollFirst();
		}
		
		System.out.println(cnt);
		br.close();
	}

}
