package 스택;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

//스택
public class StackPractice {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		int N = Integer.parseInt(br.readLine());
		
		Stack<Integer> stack = new Stack<Integer>();
		
		while(N-- > 0) {
			st = new StringTokenizer(br.readLine());
			switch (st.nextToken()) {
			case "push":
				stack.push(Integer.parseInt(st.nextToken()));
				break;
			case "pop":
				if(stack.empty()) {
					sb.append(-1).append('\n');
				} else {
					sb.append(stack.pop()).append('\n');
				}
				break;
			case "size":
				sb.append(stack.size()).append('\n');
				break;
			case "empty":
				if(stack.empty()) {
					sb.append(1).append('\n');
				} else {
					sb.append(0).append('\n');
				}
				break;
			case "top":
				if(stack.empty()) {
					sb.append(-1).append('\n');
				} else {
					sb.append(stack.get(stack.size()-1)).append('\n');
				}
				break;
			}
		}
		
		System.out.println(sb);
		br.close();
	}

}
