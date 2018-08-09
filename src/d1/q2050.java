package d1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/*
 * 알파벳을 숫자로 변환하는 방법
 * String값으로 일단 받아서 split으로 쪼갠후에
 * 하나씩 아스키 코드값을 이용하여 비교한다.
 * 참고로 대문자 A의 값은 65
 */
public class q2050 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String alpa = br.readLine();
		for(int i=0; i<alpa.length(); i++){
			bw.write(alpa.charAt(i)-64 +" ");
		}
		bw.flush();
	}
}
