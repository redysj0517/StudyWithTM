package d16.dp;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class q9251 {
	
	static int[][]dp = new int[1001][1001];
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String A = br.readLine();
		String B = br.readLine();
		for(int i=0; i<A.length(); i++) {
			for(int j=0; j<B.length(); j++) {
				if(A.charAt(i)==B.charAt(j)) {
					dp[i+1][j+1] = dp[i][j]+1;
				}else {
					dp[i+1][j+1] = Math.max(dp[i][j+1], dp[i+1][j]);
				}
			}
		}
		bw.write(dp[A.length()][B.length()]+"\n");
		bw.flush();
	}
}
