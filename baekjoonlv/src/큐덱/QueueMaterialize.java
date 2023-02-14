package 큐덱;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//큐 직접구현
public class QueueMaterialize {
	
	static int[] q = new int[2000000];
	
	static int size = 0;
	static int front = 0;
	static int back = 0;

    static StringBuilder sb = new StringBuilder();
	
	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		StringTokenizer st;
		while(N-- > 0) {
			st = new StringTokenizer(br.readLine(), " ");
			
			switch(st.nextToken()) {
			case "push": push(Integer.parseInt(st.nextToken())); break;
			case "pop": pop(); break;
			case "size": size(); break;
			case "empty": empty(); break;
			case "front": front(); break;
			case "back": back(); break;
			}
		}

		System.out.println(sb);
		br.close();
	}
	
	static void push(int n) {
		q[back] = n;
		back++;
		size++;
	}
	
	static void pop() {
		if(size == 0) {
			sb.append(-1).append('\n');
		}
		else {
			sb.append(q[front]).append('\n');
			size--;
			front++;
		}
	}
	
	static void size() {
		sb.append(size).append('\n');
	}
	
	static void empty() {
		if(size == 0) {
			sb.append(1).append('\n');
		}
		else {
			sb.append(0).append('\n');
		}
	}
	
	static void front() {
		if(size == 0) {
			sb.append(-1).append('\n');
		}
		else {
			sb.append(q[front]).append('\n');
		}
	}
	
	static void back() {
		if(size == 0) {
			sb.append(-1).append('\n');
		}
		else {
			sb.append(q[back-1]).append('\n');
		}
	}

}
