package �ݺ���;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Star2 {

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int t = Integer.parseInt(br.readLine());
		br.close();
		
		for(int i = 1; i <= t; i++) {
			for(int j = t; j > 0; j--) {
				if(j > i) {
					bw.write(" ");
				} else {
					bw.write("*");
				}
			}
			bw.newLine();
		}
		bw.flush();
		bw.close();
	}

}
