package d1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/*
 * D1.2025 N줄덧셈
 * 1부터 주어진 숫자만큼 모두 더한 값을 출력
 * 그냥 반복문 수행.
 */
public class q2025 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		int sum = 0;
		for(int i=1; i<= N; i++){
			sum+=i;
		}
		bw.write(sum+"\n");
		bw.flush();
		
	}
}
