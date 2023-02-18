package ����;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

//���� ����
public class StackSequence {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		Stack<Integer> stk = new Stack<Integer>();
		int N = Integer.parseInt(br.readLine());
		int start = 0;
		
		while(N-- > 0) {
			int val = Integer.parseInt(br.readLine());
			
			if(val > start) {
				//start+1���� �Է¹��� val���� push
				for(int i = start+1; i <= val; i++) {
					stk.push(i);
					sb.append('+').append('\n');
				}
				start = val;
			}
			
			//top���ҿ� ���� �ٸ� ���
			else if(stk.peek() != val) {
				System.out.println("NO");
				return;
			}
			
			stk.pop();
			sb.append('-').append('\n');
		}
		
		System.out.println(sb);
		br.close();
	}

}
