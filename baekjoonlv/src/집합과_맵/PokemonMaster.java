package 집합과_맵;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

//포켓몬 도감 맞추기
public class PokemonMaster {

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken()); //도감 포켓몬
		int m = Integer.parseInt(st.nextToken()); //맞춰야하는 문제

		HashMap<String, String> map = new HashMap<String, String>();
		for(int i = 1; i <= n; i++) {
			String name = br.readLine();
			map.put(i+"", name);
			map.put(name, i+"");
		}
		
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < m; i++) {
			String s = br.readLine();
			sb.append(map.get(s)).append("\n");
		}
		
		System.out.println(sb);
		
	}

}
