package 누적합;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//인간-컴퓨터 상호작용 - 블로그참고
public class HumanComputer {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		String s = br.readLine(); //문자열
		int q = Integer.parseInt(br.readLine()); //문제수
		
		//전체 누적합 구하기
		int[][] arr = new int[s.length()][26];
		arr[0][s.charAt(0)-'a']++;
		for(int i = 1; i < s.length(); i++) {
			//이전 누적합 복붙
			for(int j = 0; j < 26; j++) {
				arr[i][j] = arr[i-1][j];
			}
			//누적합 추가
			int idx = s.charAt(i)-'a';
			arr[i][idx]++;
		}
		
		StringTokenizer st;
		for(int t = 0; t < q; t++) {
			st = new StringTokenizer(br.readLine());
			int a = st.nextToken().charAt(0)-'a'; //찾을문자
			int l = Integer.parseInt(st.nextToken()); //시작위치
			int r = Integer.parseInt(st.nextToken()); //끝위치
			
			if(l == 0) sb.append(arr[r][a]).append('\n');
			else sb.append(arr[r][a] - arr[l-1][a]).append('\n');
		}

		System.out.println(sb);
		br.close();
	}

}
