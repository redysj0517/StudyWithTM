package d1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/*
 * D1.2019 더블더블
 * 1부터 주어진 횟수까지 2를 곱한 값들 출력
 */
public class q2019 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());
		int temp = 1;
		for (int i = 0; i <= N; i++) {
			if (i == 0) {
				temp =1;
				bw.write(temp +" ");
			} else {
				temp *= 2;
				bw.write(temp + " ");
			}
		}
		bw.flush();
	}
}
