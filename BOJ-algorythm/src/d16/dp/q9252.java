package d16.dp;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class q9252 {
	static int[][]dp = new int[1001][1001];
	static char[] A = new char[1001];
	static char[] B = new char[1001];
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		A = br.readLine().toCharArray();
		B = br.readLine().toCharArray();
		int n = A.length;
		int m = B.length;
		
		bw.write(getLCSLength(n,m)+"\n");
		bw.write(getLCSStr(n,m)+"\n");
		bw.flush();
	}
	
	public static int getLCSLength(int n, int m) {
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=m; j++) {
				if(A[i-1] == B[j-1]) {
					dp[i][j] = dp[i-1][j-1]+1;
				}else {
					dp[i][j] = Math.max(dp[i][j-1], dp[i-1][j]);
				}
			}
		}
		return dp[n][m];
	}
	
	public static String getLCSStr(int n, int m) {
		if(n==0 || m==0) {
			return "";
		}else if(A[n-1] == B[m-1]) {
			return getLCSStr(n-1, m-1) + A[n-1];
		}else {
			if(dp[n][m-1] > dp[n-1][m])
				return getLCSStr(n,m-1);
			else
				return getLCSStr(n-1,m);
		}
		
		
	}
}
