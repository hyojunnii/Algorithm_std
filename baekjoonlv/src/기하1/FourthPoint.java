package 기하1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

//직사각형의 네번째점
public class FourthPoint {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		ArrayList<String> X = new ArrayList<String>();
		ArrayList<String> Y = new ArrayList<String>();
		
		for(int i = 0; i < 3; i++) {
			st = new StringTokenizer(br.readLine());
			String x = st.nextToken();
			String y = st.nextToken();
			if(X.contains(x)) {
				X.remove(x);
			} else {
				X.add(x);
			}
			if(Y.contains(y)) {
				Y.remove(y);
			} else {
				Y.add(y);
			}
		}
		br.close();
		System.out.println(X.get(0) + " " + Y.get(0));
	}
	
}
