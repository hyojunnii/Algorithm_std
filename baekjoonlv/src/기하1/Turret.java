package 기하1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//터렛 - 블로그참고
// 두 원의 접점 구하기
public class Turret {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		int t = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < t; i++) {
			st = new StringTokenizer(br.readLine());
			int x1 = Integer.parseInt(st.nextToken());
			int y1 = Integer.parseInt(st.nextToken());
			int r1 = Integer.parseInt(st.nextToken());
			
			int x2 = Integer.parseInt(st.nextToken());
			int y2 = Integer.parseInt(st.nextToken());
			int r2 = Integer.parseInt(st.nextToken());
			
			int result = turret(x1, y1, r1, x2, y2, r2);
			sb.append(result).append("\n");
		}
		
		System.out.println(sb);
		br.close();
	}
	
	public static int turret(int x1, int y1, int r1, int x2, int y2, int r2) {
		
		//두점간의 거리 : ((x2-x1)^2 + (y2-y1)^2))^1/2
		double dist = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
		
		int sum = r1 + r2;
		int sub = Math.abs(r1 - r2);
		
		//case1 : 중점같으면서 반지름 같음 (접점무한대)
		if(dist == 0 && r1 == r2) {
			return -1;
		}
		
		//case2-1 : 떨어져있는 두 원 (원점간 거리가 반지름 합보다 김)
		else if(dist > sum) {
			return 0;
		}
		
		//case2-2 : 내접하지 않는 원안에 원 (원점간 거리가 반지름 차이보다 짧음)
		else if(dist < sub) {
			return 0;
		}
		
		//case3-1 : 내접 (원점간 거리가 반지름 차이과 일치)
		else if(dist == sub) {
			return 1;
		}
		
		//case3-2 : 외접 (원점간 거리가 반지름 합과 일치)
		else if(dist == sum) {
			return 1;
		}
		
		//나머지는 접점 2개 (적당히 겹치는 경우)
		return 2;
	}

}
