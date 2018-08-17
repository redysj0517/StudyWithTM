package d2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class q1966 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int T = Integer.parseInt(br.readLine());
		
		for(int tc = 1 ; tc<=T; tc++){
			int N = Integer.parseInt(br.readLine());
			int arr[] = new int[N];
			String str[] = br.readLine().split(" ");
			for(int i=0; i<N; i++){
				arr[i] = Integer.parseInt(str[i]);
			}
			Arrays.sort(arr);
			bw.write("#"+tc+" ");
			for(int i=0; i<N; i++){
				bw.write(arr[i]+" ");
			}
			bw.write("\n");
		}
		bw.flush();
	}
}
