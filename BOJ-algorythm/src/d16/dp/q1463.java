package d16.dp;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/*
 * 규칙을 보면
 * n=1일때는 0
 * n=2일때는 -1을 해주므로 1이다
 * N이라는 수를 가장 작게 연산하는 방법은
 * 1) dp[n] = dp[n-1]에다가 +1 연산을 하는 경우
 * 2) dp[n] = dp[n/2]에다가 +1 연산을 하는 경우
 * 3) dp[n] = dp[n/3]에다가 +1 연산을 하는 경우..
 * 
 */
public class q1463 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		int dp[] = new int[N+1];
		
		dp[1] = dp[0] = 0;
		for(int i=2; i<=N; i++) {
			dp[i] = dp[i-1]+1;
			//i가 2와 3으로 모두 나뉠수도있어서
			//이순서대로 돌려야함.
			if(i%2==0) {
				dp[i]  = Math.min(dp[i/2] +1,dp[i]);
			}
			if(i%3==0) {
				dp[i] = Math.min(dp[i/3] +1,dp[i]);
			}
		}
		bw.write(dp[N]+"");
		bw.flush();
	}
}
