package d1;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

/*
 * D1.2027 대각선 출력하기
 * 솔직히 뭘 말하는 문제인지 모르겠음
 * 그냥 출력똑같이 함.
 */
public class q2027 {
	public static void main(String[] args) throws IOException {
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		bw.write("#++++"+"\n");
		bw.write("+#+++"+"\n");
		bw.write("++#++"+"\n");
		bw.write("+++#+"+"\n");
		bw.write("++++#"+"\n");
		bw.flush();
	}
}
