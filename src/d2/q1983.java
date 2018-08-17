package d2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class q1983 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String grade[] = { "A+", "A0", "A-", "B+", "B0", "B-", "C+", "C0", "C-", "D0" };

		int T = Integer.parseInt(br.readLine());
		for (int tc = 1; tc <= T; tc++) {
			String str[] = br.readLine().split(" ");
			int N = Integer.parseInt(str[0]);
			int K = Integer.parseInt(str[0]);
			double score[] = new double[N];
			for(int i=0; i<N; i++){
				str = br.readLine().split(" ");
				score[i] = Double.parseDouble(str[0])*0.35
						+ Double.parseDouble(str[1])*0.45
						+ Double.parseDouble(str[2])*0.20;
			}
			int cnt = 0;
			for(int i=0; i<N; i++){
				if((i!=K-1) && (score[i]>score[K-1])){
					cnt++;
				}
			}
			bw.write("#"+tc+" "+grade[cnt/(N/10)]+"\n");
		}
		bw.flush();
	}
}
