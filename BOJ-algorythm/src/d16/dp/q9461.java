package d16.dp;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
// dp[i] = dp[i-5] + dp[i-1];
public class q9461 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int T = Integer.parseInt(br.readLine());
		for (int testcase = 1; testcase <= T; testcase++) {

			int n = Integer.parseInt(br.readLine());
			long dp[] = new long[101];
			dp[0] = 0;
			dp[1] = dp[2] = dp[3] = 1;
			dp[4] = dp[5] = 2;
			if (n < 6) {
				bw.write(dp[n] + "\n");
			} else {
				for (int i = 6; i <= n; i++) {
					dp[i] = dp[i - 5] + dp[i - 1];
				}
				bw.write(dp[n] + "\n");
			}
		}
		bw.flush();
	}
}
