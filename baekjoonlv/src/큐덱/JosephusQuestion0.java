package Å¥µ¦;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

//¿ä¼¼Çª½º ¹®Á¦ 0
public class JosephusQuestion0 {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());

		Deque<Integer> que = new ArrayDeque<Integer>();
		
		for(int i = 1; i <= n; i++) {
			que.offer(i);
		}
		
		sb.append('<');
		while(true) {
			for(int i = 0; i < k; i++) {
				if(i == k-1) {
					sb.append(que.poll());
				} else {
					que.offer(que.poll());
				}
			}
			if(que.size() != 0) {
				sb.append(", ");
			} else {
				sb.append(">");
				break;
			}
		}
		System.out.println(sb);
		br.close();
	}

}
