package 백트래킹;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//연산자 끼워넣기
public class Operators {
	
	public static int N;
	public static int max = -1000000001;
	public static int min = 1000000001;
	public static int[] arr;
	public static int[] oper = new int[4];

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		N = Integer.parseInt(br.readLine());
		arr = new int[N];
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < 4; i++) {
			oper[i] = Integer.parseInt(st.nextToken());
		}
		
		op(arr[0], 1);
		
		System.out.println(max);
		System.out.println(min);
		br.close();
	}
	
	public static void op(int result, int idx) {
		if(idx == N) {
			if(result > max) max = result;
			if(result < min) min = result;
			return;
		}
		
		for(int i = 0; i < 4; i++) {
			if(oper[i] > 0) {
				oper[i]--;
				if(i == 0) op(result + arr[idx], idx+1);
				else if(i == 1) op(result - arr[idx], idx+1);
				else if(i == 2) op(result * arr[idx], idx+1);
				else op(result / arr[idx], idx+1);
				oper[i]++;
			}
		}
		return;
	}

}
