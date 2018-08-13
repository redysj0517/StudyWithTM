package d16.dp;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/*
 * ��Ģ�� ����
 * n=1�϶��� 0
 * n=2�϶��� -1�� ���ֹǷ� 1�̴�
 * N�̶�� ���� ���� �۰� �����ϴ� �����
 * 1) dp[n] = dp[n-1]���ٰ� +1 ������ �ϴ� ���
 * 2) dp[n] = dp[n/2]���ٰ� +1 ������ �ϴ� ���
 * 3) dp[n] = dp[n/3]���ٰ� +1 ������ �ϴ� ���..
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
			//i�� 2�� 3���� ��� ���������־
			//�̼������ ��������.
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
