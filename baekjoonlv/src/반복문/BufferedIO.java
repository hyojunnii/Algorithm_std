package 반복문;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class BufferedIO {

	public static void main(String[] args) throws IOException {
		
		/* I/O Stream
		 * Stream(스트림) : Byte형태, 단방향 연결, FIFO
		 * 
		 * Buffered
		 * - 버퍼에 저장 후 한번에 출력가능
		 * - enter만 경계로 인식
		 * - 기본 String, 숫자는 형변환해야
		 * 
		 * buffered reader
		 * br.readLine()
		 * br.close()
		 * 
		 * buffered writer
		 * bw.write()	//숫자일시 문자열 붙여야 제대로 출력
		 * bw.newLine() //개행
		 * bw.flush() //버퍼 값 출력 && 버퍼 초기화
		 * bw.close()
		 * 
		 * StringTokenizer
		 * - 하나의 문자열을 여러개의 토큰으로 분리
		 * new StringTokenizer(br.readLine(), " ")
		 * st.nextToken()
		 * 
		 */
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int t = Integer.parseInt(br.readLine());
		
		StringTokenizer st;		
		int a,b;
		for(int i = 0; i < t; i++) {
			st = new StringTokenizer(br.readLine());
			a = Integer.parseInt(st.nextToken());
			b = Integer.parseInt(st.nextToken());
			bw.write(a+b + "\n");
		}
		br.close();
		
		bw.flush();
		bw.close();
	}

}
