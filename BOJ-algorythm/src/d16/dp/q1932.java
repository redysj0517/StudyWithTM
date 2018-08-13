package d16.dp;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class q1932 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int T = Integer.parseInt(br.readLine());
		int arr[][] = new int[T+1][T+1];
		int max = 0;
		for(int i=1; i<=T; i++) {
			StringTokenizer st =new StringTokenizer(br.readLine());
			for(int j=1; j<=i; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
				
				if(j==1) {
					arr[i][j] = arr[i-1][j]+arr[i][j];
				}else if(j==i) {
					arr[i][j] = arr[i-1][j-1]+arr[i][j];
				}else {
					arr[i][j] = Math.max(arr[i-1][j-1], arr[i-1][j])+arr[i][j];
				}
				
				if(max<arr[i][j]) {
					max = arr[i][j];
				}
				
			}
		}
		bw.write(max+"\n");
		bw.flush();
	}
}
