package �ݺ���;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class BufferedIO {

	public static void main(String[] args) throws IOException {
		
		/* I/O Stream
		 * Stream(��Ʈ��) : Byte����, �ܹ��� ����, FIFO
		 * 
		 * Buffered
		 * - ���ۿ� ���� �� �ѹ��� ��°���
		 * - enter�� ���� �ν�
		 * - �⺻ String, ���ڴ� ����ȯ�ؾ�
		 * 
		 * buffered reader
		 * br.readLine()
		 * br.close()
		 * 
		 * buffered writer
		 * bw.write()	//�����Ͻ� ���ڿ� �ٿ��� ����� ���
		 * bw.newLine() //����
		 * bw.flush() //���� �� ��� && ���� �ʱ�ȭ
		 * bw.close()
		 * 
		 * StringTokenizer
		 * - �ϳ��� ���ڿ��� �������� ��ū���� �и�
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
