package 집합과_맵;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class NumberCard2 {

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine()); //상근이 카드
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n; i++) {
			int num = Integer.parseInt(st.nextToken());
			if(map.containsKey(num)) {
				map.replace(num, map.get(num)+1);
			} else {
				map.put(num, 1);
			}
		}

		int m = Integer.parseInt(br.readLine()); //숫자 카드
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < m; i++) {
			int card = Integer.parseInt(st.nextToken());
			boolean flag = map.containsKey(card);
			if(flag) {
				sb.append(map.get(card)).append(" ");
			} else {
				sb.append("0 ");
			}
		}
		
		br.close();
		System.out.println(sb);
	}

}
