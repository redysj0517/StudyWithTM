package stage10;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class q4948 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		boolean flag = true;
		while (flag) {
			int N = Integer.parseInt(br.readLine());
			if (N == 0) {
				flag = false;
				break;
			}

			boolean arr[] = new boolean[2 * N +1];
			for (int i = 2; i <= 2 * N; i++) {
				arr[i] = true;
			}
			for (int i = 2; i <= Math.sqrt(2 * N); i++) {
				if (arr[i]) {
					for (int j = 2; i * j <= 2 * N; j++) {
						arr[i * j] = false;
					}
				}
			}
			int count = 0;
			
			for(int i = N +1; i<= 2*N; i++){
				if(arr[i])
					count++;
			}
			bw.write(count+"\n");
		}
		bw.flush();
	}
}
