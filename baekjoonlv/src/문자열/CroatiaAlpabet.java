package ¹®ÀÚ¿­;

import java.util.Scanner;

public class CroatiaAlpabet {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
//		String s = sc.nextLine();
//		
//		String[] arr = s.split("");
//
//		int cnt = arr.length;
//		for(int i = 0; i < arr.length; i++) {
//			if(i < arr.length-1) {
//				if("lj".equals(arr[i] + arr[i+1]) || "nj".equals(arr[i] + arr[i+1])) {
//					cnt--; i++;
//					continue;
//				}
//			}
//			if(i < arr.length-2) {
//				if("dz=".equals(arr[i] + arr[i+1] + arr[i+2])) {
//					cnt -= 2;
//					i += 2;
//					continue;
//				}
//			}
//			if("=".equals(arr[i]) || "-".equals(arr[i])) {
//				cnt--;
//			}
//		}
//		System.out.println(cnt);
		
		String str = sc.nextLine()
			.replace("c=", " ")
			.replace("c-", " ")
			.replace("dz=", " ")
			.replace("d-", " ")
			.replace("lj", " ")
			.replace("nj", " ")
			.replace("s=", " ")
			.replace("z=", " ");
		System.out.println(str.length());
		sc.close();
	}

}
