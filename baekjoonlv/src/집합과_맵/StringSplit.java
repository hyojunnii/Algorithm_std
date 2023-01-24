package 집합과_맵;

import java.util.HashSet;
import java.util.Scanner;

//서로 다른 부분 문자열의 개수
public class StringSplit {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		
		HashSet<String> set = new HashSet<String>();

		int cnt = 1;
		for(int i = 0; i < s.length(); i++) {
			for(int j = cnt; j < s.length()+1; j++) {
				set.add(s.substring(i, j));
			}
			cnt++;
		}
		
		System.out.println(set.size());
		sc.close();
	}

}
