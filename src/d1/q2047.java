package d1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
/*
 * D1.2047 신문 헤드라인
 * 헤드라인 소문자 알파벳을 받아 대문자로 출력하기
 * 그냥 라이브러리 이용하면될듯?
 */
public class q2047 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String small = br.readLine();
		String big = small.toUpperCase();
		bw.write(big+"\n");
		bw.flush();
	}
}
