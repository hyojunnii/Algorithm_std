package 기하1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//어린왕자
// 다른 지점으로 가면서 행성의 최소 진입, 이탈 횟수
// 출발점과 도착점이 각 원 안에 속하는 지 판단
public class LittlePrince {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
	
		int t = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < t; i++) {
			//출발점, 도착점
			st = new StringTokenizer(br.readLine());
			int x1 = Integer.parseInt(st.nextToken());
			int y1 = Integer.parseInt(st.nextToken());
			int x2 = Integer.parseInt(st.nextToken());
			int y2 = Integer.parseInt(st.nextToken());
			
			//행성계 개수
			int n = Integer.parseInt(br.readLine());
			
			int cnt = 0; //진입횟수
			for(int j = 0; j < n; j++) {
				boolean start = false;
				boolean end = false;
				
				st = new StringTokenizer(br.readLine());
				int c1 = Integer.parseInt(st.nextToken());
				int c2 = Integer.parseInt(st.nextToken());
				int r = Integer.parseInt(st.nextToken());
				
				//출발점, 도착점이 원 안에 있는지 판단
				//공식 : (x2-x1)^2 + (y2-y1)^2 <= r^2
				if(Math.pow(x1 - c1, 2) + Math.pow(y1 - c2, 2) <= Math.pow(r, 2)) {
					start = true;
					cnt++;
				}
				if(Math.pow(x2 - c1, 2) + Math.pow(y2 - c2, 2) <= Math.pow(r, 2)) {
					end = true;
					cnt++;
				}
				//한원 안에 동시에 속하는 경우
				if(start && end) cnt -= 2;
			}
			
			sb.append(cnt).append('\n');
		}
		
		System.out.println(sb);
		br.close();
	}

}
