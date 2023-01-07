package 정렬;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashMap;

public class WordSort {

	//단어정렬
	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		
		// sort comparator 사용!!!!!
		HashSet<String> set = new HashSet<>();
		for(int i = 0; i < n; i++) {
			set.add(br.readLine());
		}
		br.close();
		
		String[] arr = new String[set.size()];
		set.toArray(arr);
		Arrays.sort(arr, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				if(o1.length() == o2.length()) {
					return o1.compareTo(o2);
				} else {
					return o1.length() - o2.length();
				}
			}
		});
		
		// 길이정렬 직접구현
//		String[] arr = new String[n];
//		for(int i = 0; i < n; i++) {
//			arr[i] = br.readLine();
//		}
//		Arrays.sort(arr);
		
//		//순서보장 LinkedHashMap
//		LinkedHashMap<String, Integer> map = new LinkedHashMap<String, Integer>(); 
//		for(String s : arr) {
//			//없을시 저장
//			map.putIfAbsent(s, s.length());
//		}
//		
		//길이정렬
//		Object[] keys = map.keySet().toArray();
//		arr = new String[map.size()];
//		int cnt = 0;
//		for(int i = 1; i < 51; i++) {
//			for(int j = 0; j < map.size(); j++) {
//				if(map.get(keys[j]) == i) {
//					arr[cnt] = (String)keys[j];
//					cnt++;
//				}
//			}
//		}
		
		for(String s : arr) {
			sb.append(s).append("\n");
		}
		
		System.out.println(sb);
		
	}

}
