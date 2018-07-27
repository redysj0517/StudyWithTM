package stage6;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class q8958 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int T = Integer.parseInt(br.readLine());

		for (int i = 0; i < T; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String temp = st.nextToken();
			bw.write(String.valueOf(Calculate(temp)));
			bw.newLine();
		}
		bw.flush();

	}

	private static int Calculate(String temp) {
		int sum = 0;
		int score = 0;
		StringTokenizer st = new StringTokenizer(temp,"X");
		while (st.hasMoreTokens()) {
			int ss = st.nextToken().length();
			for(int i=1; i<=ss; i++){
				score+=i;
			}
			sum+=score;
			score = 0;
		}
		return sum;
	}
}
