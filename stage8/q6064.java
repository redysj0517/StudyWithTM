package stage8;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class q6064 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int M = 0, N =0, x = 0, y = 0;
		int T = Integer.parseInt(br.readLine());
		for (int testCase = 0; testCase < T; testCase++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			while (st.hasMoreTokens()) {
				M = Integer.parseInt(st.nextToken());
				N = Integer.parseInt(st.nextToken());
				x = Integer.parseInt(st.nextToken());
				y = Integer.parseInt(st.nextToken());
			}
			bw.write(findYear(M, N, x, y) + "\n");
		}
		bw.flush();
	}

	public static int findYear(int M, int N, int x, int y) {
		int k = 1;
		int i = 1;
		int j = 1;
		boolean flag = false;
		
		while (i <= M && j <= N) {
			if (i == x && j == y) {
				flag = true;
				break;
			} else if (i < M && j < N) {
				i++;
				j++;
				k++;
			} else if (i == M && j < N) { // 달은 맞고 j은 안맞는경우
				i = 1;
				j++;
				k++;
			} else if (i < M && j == N) {
				i++;
				j = 1;
				k++;
			} else {
				break;
			}
		}
		
		return flag ? k : -1;
	}
}
