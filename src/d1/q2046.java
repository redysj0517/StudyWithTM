package d1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/*
 * d1.2046 스탬프 찍기
 * 그냥 입력값 받은만큼 반복문 돌려서 찍기
 */
public class q2046 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		for(int i=0; i<N; i++){
			bw.write("#");
		}
		bw.flush();
	}
}
