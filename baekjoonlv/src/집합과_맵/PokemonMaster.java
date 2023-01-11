package ���հ�_��;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

//���ϸ� ���� ���߱�
public class PokemonMaster {

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken()); //���� ���ϸ�
		int m = Integer.parseInt(st.nextToken()); //������ϴ� ����

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
