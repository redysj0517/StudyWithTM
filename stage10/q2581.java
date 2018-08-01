package stage10;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class q2581 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int M = Integer.parseInt(br.readLine());
		int N = Integer.parseInt(br.readLine());
		int sum = 0;
		int min = 10000;
		for (int i = M; i <= N; i++) {
			int flag_count = 0;
			
			for (int j = 1; j <= i; j++) {
				if (i % j == 0) {
					flag_count++;
				}
			}
			if (flag_count == 2) { // 2이면 소수 인저엉
				sum += i;
				if (min > i) {
					min = i;
				}
			}
		}
		if(sum==0){
			bw.write(-1 + "\n");
		}else{
		bw.write(sum + "\n");
		bw.write(min + "\n");
		}
		bw.flush();
	}
}
