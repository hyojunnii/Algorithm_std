package ���հ�_��;

import java.util.HashSet;
import java.util.Scanner;

//���� �ٸ� �κ� ���ڿ��� ����
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
