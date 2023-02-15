package Å¥µ¦;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

//Ä«µå2
public class Card2 {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());

		Deque<Integer> que = new ArrayDeque<>();
		
		for(int i = 1; i <= N; i++) {
			que.offer(i);
		}
		
		while(que.size() > 1) {
			que.poll();
			que.offer(que.poll());
		}
		
		System.out.println(que.poll());
		br.close();
	}

}
