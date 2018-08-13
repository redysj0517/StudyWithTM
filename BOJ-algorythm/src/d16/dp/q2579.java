package d16.dp;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
/*
 * 규칙1
 * 마지막 계단은 꼭밟아야한다.
 * 그렇다면 마지막 계단을 dp[n]이라한다면 두가지 경우가 있음.
 * 연속해서 밟았을경우, 그러지 못했을 경우.
 * 즉, 1) dp[n] = arr[n] + arr[n-1] + dp[n-3]
 *     2) dp[n] = arr[n] + dp[n-2]
 * 이것중 큰 값을 고르면된다.
 */
public class q2579 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		int arr[] = new int[N+1];
		int dp[] = new int[N+1];
		for(int i=1; i<=N; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		dp[1] = arr[1]; 
		if(N>=2) {
			dp[2] = dp[1]+arr[2];
		}
		for(int i=3; i<=N; i++) {
			dp[i] = Math.max(arr[i]+arr[i-1]+dp[i-3], arr[i]+dp[i-2]);
		}
		bw.write(dp[N]+"");
		bw.flush();
	}
}
