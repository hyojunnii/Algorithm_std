package 큐덱;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Queue2 {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(br.readLine());

		//또는 Deque - peeklast
		LinkedList<Integer> que = new LinkedList<Integer>();
		
		StringTokenizer st;
		while(N-- > 0) {
			st = new StringTokenizer(br.readLine(), " ");
			
			switch (st.nextToken()) {
			case "push":
				que.offer(Integer.parseInt(st.nextToken()));
				break;
			case "pop":
				//큐는 비어있으면 널값 반환
				//if(item == null)
				if(que.isEmpty()) sb.append(-1).append('\n');
				else sb.append(que.poll()).append('\n');
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
				else sb.append(que.peek()).append('\n');
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
