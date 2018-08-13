package d16.dp;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

/*
 * dp[i][j] = dp[i-1][j] + dp[i][j-coin[j]]
 */

public class q2293 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		int coin[] = new int[n+1];
		int dp[][] = new int[101][10001]; 
		for(int i=1; i<=n; i++) {
			coin[i] = Integer.parseInt(br.readLine());
		}
		for(int i=0; i<=n; i++) {
			dp[i][0] = 1;
		}
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=k; j++) {
				if(j-coin[i] <0) {
					dp[i][j] = dp[i-1][j];
				}else {
					dp[i][j] = dp[i-1][j] + dp[i][j-coin[i]];
				}
			}
		}
		bw.write(dp[n][k]+"");
		bw.flush();
	}
}
