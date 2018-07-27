 package stage4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class q10871 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int X = Integer.parseInt(st.nextToken());
		
		int arr[] = new int[N];
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<arr.length; i++){
			arr[i] = Integer.parseInt(st.nextToken());
		}
		for(int i=0; i<arr.length; i++){
			if(arr[i] < X)
				bw.write(String.valueOf(arr[i]+" "));
		}
		bw.newLine();
		bw.flush();
	}
}
