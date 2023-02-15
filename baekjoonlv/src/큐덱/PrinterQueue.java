package 큐덱;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

//프린터 큐
public class PrinterQueue {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(br.readLine());
		
		StringTokenizer st;
		while(N-- > 0) {
			st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken());
			int m = Integer.parseInt(st.nextToken());
			
			Deque<Integer> que = new ArrayDeque<Integer>();
			int[] seq = new int[n];
			
			st = new StringTokenizer(br.readLine(), " ");
			for(int i = 0; i < n; i++) {
				seq[i] = Integer.parseInt(st.nextToken());
				que.offer(seq[i]);
			}
			Arrays.sort(seq);
			
			int tmp = m;
			int cnt = 0;
			boolean flag = false;
			for(int i = n-1; i >= 0; i--)  {
				for(int j = 0; j < que.size(); j++) {
					if(que.peek() == seq[i]) {
						cnt++;
						if(tmp == 0) {
							flag = true;
						}
						que.poll();
						tmp--;
						break;
					} else {
						if(tmp == 0) tmp = que.size();
						que.offer(que.poll());
						tmp--;
					}
				}
				if(flag) break;
			}
			sb.append(cnt).append('\n');
		}
		System.out.println(sb);
		br.close();
	}

}
