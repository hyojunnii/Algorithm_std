package 정수론및조합론;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

//패션왕 신해빈
// 옷조합 구하기
public class FashionKing {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		int t = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < t; i++) {
			int n = Integer.parseInt(br.readLine());
			
			HashMap<String, Integer> map = new HashMap<String, Integer>();
			
			for(int j = 0; j < n; j++) {
				st = new StringTokenizer(br.readLine());
				st.nextToken();
				String kind = st.nextToken();
				
				if(map.containsKey(kind)) {
					map.replace(kind, map.get(kind)+1);
				} else {
					map.put(kind, 1);
				}
			}
			
			int result = 1;
			//안입는 경우 포함한 경우의 수 -> 종류1+1 * 종류2+1 ...
			// hat 2개 eye 1개 -> 3 * 2
			for(int num : map.values()) {
				result *= num+1;
			}
			
			//아무것도 안입는경우 제외
			sb.append(result - 1).append("\n");
		}
		
		System.out.println(sb);
		br.close();
	}
	
}
