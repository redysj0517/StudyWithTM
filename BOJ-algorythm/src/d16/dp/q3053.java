package d16.dp;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class q3053 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int r = Integer.parseInt(br.readLine());
		//원점 (0,0) 과 (r,0)을 생각하여 문제를 풀자.
		String res1 = String.format("%.6f", Math.PI*r*r);
		String res2 = String.format("%.6f", (double)2*r*r);
		bw.write(res1+"\n");
		bw.write(res2+"");
		bw.flush();
	}
}
