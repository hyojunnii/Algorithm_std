package ¹®ÀÚ¿­;

import java.util.*;

public class CntMaxAlpabet {

	public static void main(String[] args) throws Exception {
		
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine().toUpperCase();
		
		char[] arr = s.toCharArray();
		Arrays.sort(arr);
		
		String str = arr[0] + "";
		int max = 0;
		int temp = 1;
		
		for(int i = 0; i < arr.length-1; i++) {
			if(arr[i] == arr[i+1]) {
				temp++;
				if(max < temp) {
					max = temp;
					str = arr[i] + "";
				} else if (max == temp) {
					str = "?";
					continue;
				}
			} else {
				temp = 1;
			}
		}
		
		System.out.println(str);
	}

}
