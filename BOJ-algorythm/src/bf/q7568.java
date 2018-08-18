package bf;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class q7568 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		int weight[] = new int[N];
		int height[] = new int[N];
		int rank[] = new int[N];
		
		for(int i=0; i<N; i++) {
			String str[] = br.readLine().split(" ");
			weight[i] = Integer.parseInt(str[0]);
			height[i] = Integer.parseInt(str[1]);
			rank[i] = 0;
		}
		
		for(int i=0; i<N; i++) {
			for(int j=0; j<N; j++) {
				if(weight[i]<weight[j] && height[i]<height[j]) {
					rank[i]++;
				}
			}
		}
		for(int i=0; i<N; i++) {
			bw.write(rank[i]+1 +" ");
		}
		bw.flush();
	}
}
