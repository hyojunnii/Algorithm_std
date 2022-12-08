package ±âº»_¼öÇÐ1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class AptCase {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		//0Ãþ 1È£ ~ 14Ãþ 14È£
		int[][] apt = new int[15][15];
		//1Ãþ 4È£ > 0Ãþ 1+2+3+4
		//2Ãþ 4È£ > 1Ãþ 1+3+6+10
		//3Ãþ 4È£ > 2Ãþ 1+4+10+20
		//4Ãþ 4È£ > 3Ãþ 1+5+15+35
		//5Ãþ 4È£ > 4Ãþ 1+6+21+56
		
		// 0Ãþ, 1È£ Ã¤¿ì±â
		for(int i = 0; i < 15; i++) {
			apt[0][i] = i;
			apt[i][1] = 1;
		}
		
		// ³ª¸ÓÁö Ã¤¿ì±â (Á÷ÀüÈ£, ¾Æ·¡È£ ´õÇÏ±â)
		for(int a = 1; a < 15; a++) {
			for(int b = 2; b < 15; b++) {
				apt[a][b] = apt[a][b-1] + apt[a-1][b];
			}
		}
		
		int t = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < t; i++) {
			int k = Integer.parseInt(br.readLine()); //kÃþ
			int n = Integer.parseInt(br.readLine()); //nÈ£
			
			sb.append(apt[k][n] + "\n");
		}
		
		br.close();
		System.out.println(sb);
	}

}
