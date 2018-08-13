package d16.dp;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
/*
 * ��Ģ1
 * ������ ����� ����ƾ��Ѵ�.
 * �׷��ٸ� ������ ����� dp[n]�̶��Ѵٸ� �ΰ��� ��찡 ����.
 * �����ؼ� ��������, �׷��� ������ ���.
 * ��, 1) dp[n] = arr[n] + arr[n-1] + dp[n-3]
 *     2) dp[n] = arr[n] + dp[n-2]
 * �̰��� ū ���� ����ȴ�.
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
