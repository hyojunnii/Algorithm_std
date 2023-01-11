package 집합과_맵;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.StringTokenizer;

//듣보잡
public class NoSeeNoHear {

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken()); //듣도 못한 사람
		int m = Integer.parseInt(st.nextToken()); //보도 못한 사람
		
		HashSet<String> set = new HashSet<>();
		for(int i = 0; i < n; i++) {
			 set.add(br.readLine());
		}
		
		int cnt = 0;
		ArrayList<String> list = new ArrayList<String>();
		for(int i = 0; i < m; i++) {
			String s = br.readLine();
			if(set.contains(s)) {
				cnt++;
				list.add(s);
			}
		}
		Collections.sort(list);
		
		sb.append(cnt).append("\n");
		for(String str : list) {
			sb.append(str).append("\n");
		}
		
		br.close();
		System.out.println(sb);
		
	}

}
