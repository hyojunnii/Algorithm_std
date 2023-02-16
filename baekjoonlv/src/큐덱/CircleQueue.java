package 큐덱;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

//회전하는 큐
public class CircleQueue {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());

		//idx찾기위해 LinkedList
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
			
			//위치 구하기
			int idx = que.indexOf(arr[i]);
			//중간위치
			int half;
			if(que.size() % 2 == 0) {
				half = que.size() / 2 - 1;
			} else {
				half = que.size() / 2;
			}
			
			if(idx <= half) {
				//idx앞을 다 뒤로 보내기
				for(int j = 0; j < idx; j++) {
					que.offerLast(que.pollFirst());
					cnt++;
				}
			}
			else {
				//뒤에서 idx까지 앞으로 가져오기
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
