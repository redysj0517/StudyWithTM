package d16.dp;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/*
 * 
 * 연속세잔은 마실수 없으므로 세가지가 존재함
 * 1) dp[i-1];
 * 2) dp[i-2] + arr[i];
 * 3) dp[i-3] + arr[i-1] + arr[i];
 * 이중에 가장 큰값이 dp[i]
 */
public class q2156 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		int arr[] = new int[10001];
		int dp[] = new int[10001];
		
		for(int i=1; i<=N; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		dp[1] = arr[1];
		dp[2] = arr[1]+arr[2];
		for(int i=3; i<=N; i++) {
			dp[i] = Math.max(dp[i-1], Math.max(dp[i-2]+arr[i], dp[i-3]+arr[i-1]+arr[i]));
		}
		bw.write(dp[N]+"");
		bw.flush();
	}
}
