package Å¥µ¦;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

//µ¦
public class Dequeue {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(br.readLine());

		Deque<Integer> que = new ArrayDeque<Integer>(); 
		
		StringTokenizer st;
		while(N-- > 0) {
			st = new StringTokenizer(br.readLine(), " ");
			
			switch (st.nextToken()) {
			case "push_front":
				que.offerFirst(Integer.parseInt(st.nextToken()));
				break;
			case "push_back":
				que.offerLast(Integer.parseInt(st.nextToken()));
				break;
			case "pop_front":
				if(que.isEmpty()) sb.append(-1).append('\n');
				else sb.append(que.pollFirst()).append('\n');
				break;
			case "pop_back":
				if(que.isEmpty()) sb.append(-1).append('\n');
				else sb.append(que.pollLast()).append('\n');;
				break;
			case "size":
				sb.append(que.size()).append('\n');
				break;
			case "empty":
				if(que.isEmpty()) sb.append(1).append('\n');
				else sb.append(0).append('\n');
				break;
			case "front":
				if(que.isEmpty()) sb.append(-1).append('\n');
				else sb.append(que.peekFirst()).append('\n');
				break;
			case "back":
				if(que.isEmpty()) sb.append(-1).append('\n');
				else sb.append(que.peekLast()).append('\n');
				break;
			}
		}
		
		System.out.println(sb);
		br.close();
	}

}
