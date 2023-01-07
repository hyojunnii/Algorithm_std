package ����;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashMap;

public class WordSort {

	//�ܾ�����
	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		
		// sort comparator ���!!!!!
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
		
		// �������� ��������
//		String[] arr = new String[n];
//		for(int i = 0; i < n; i++) {
//			arr[i] = br.readLine();
//		}
//		Arrays.sort(arr);
		
//		//�������� LinkedHashMap
//		LinkedHashMap<String, Integer> map = new LinkedHashMap<String, Integer>(); 
//		for(String s : arr) {
//			//������ ����
//			map.putIfAbsent(s, s.length());
//		}
//		
		//��������
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
