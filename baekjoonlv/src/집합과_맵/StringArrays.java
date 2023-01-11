package 집합과_맵;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

//문자열 집합
public class StringArrays {

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int n = Integer.parseInt(st.nextToken()); //s 집합 문자
		int m = Integer.parseInt(st.nextToken()); //검사해야할 문자
		int cnt = 0;
		
		//hashset
		HashSet<String> set = new HashSet<String>();
		for(int i = 0; i < n; i++) {
			set.add(br.readLine());
		}
		
		for(int i = 0; i < m; i++) {
			String s = br.readLine();
			if(set.contains(s)) {
				cnt++;
			}
		}
		
		//배열
//		String[] s = new String[n];
//		for(int i = 0; i < n; i++) {
//			s[i] = br.readLine();
//		}
//		
//		for(int i = 0; i < m; i++) {
//			String str = br.readLine();
//			for(int j = 0; j < n; j++) {
//				if(s[j].equals(str)) {
//					cnt++;
//					continue;
//				}
//			}
//		}
		
		br.close();
		System.out.println(cnt);
	}

}
