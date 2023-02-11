package 스택;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

//제로
public class Zero {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		Stack<Integer> stk = new Stack<Integer>();
		
		while(N-- > 0) {
			int num = Integer.parseInt(br.readLine());
			if(num != 0) {
				stk.push(num);
			} else {
				stk.pop();
			}
		}
		
		int sum = 0;
		for(int i = 0; i < stk.size(); i++) {
			sum += stk.get(i);
		}
		
		System.out.println(sum);
		br.close();
	}

}
