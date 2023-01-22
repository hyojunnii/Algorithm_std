package 재귀;

import java.io.BufferedReader;
import java.io.InputStreamReader;

//하노이탑 이동순서 구하기
public class HanoiTower {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		br.close();
		
		hanoi(n, 1, 2, 3); //원판개수, 출발지, 이동장소, 목적지
		
		System.out.println(cnt);
		System.out.println(sb);
		
	}
	
	public static StringBuilder sb = new StringBuilder();
	public static int cnt = 0;
	
	public static void hanoi(int n, int start, int step, int end) {
		//이동횟수
		/*하노이탑 공식 : Math.pow(2, n)-1))*/
		cnt++;
		
		//원반 1개면 재귀탈출
		if(n == 1) {
			sb.append(start + " " + end + "\n");
			return;
		}
		
		//1. n-1개를 A에서 B로 이동
		hanoi(n-1, start, end, step);
		
		//2. 가장 큰 1개를 A에서 C로 이동
		sb.append(start + " " + end + "\n");
		
		//3. 나머지 n-1개를 B에서 C로 이동
		hanoi(n-1, step, start, end);
	}

}
