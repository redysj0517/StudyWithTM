package d2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class q1945 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int T = Integer.parseInt(br.readLine());

		for (int tc = 1; tc <= T; tc++) {
			int N = Integer.parseInt(br.readLine());
			int a = 0;
			int b = 0;
			int c = 0;
			int d = 0;
			int e = 0;
			while (N % 11 == 0 || N % 7 == 0 || N % 5 == 0 || N % 3 == 0 || N % 2 == 0) {
				if (N % 11 == 0) {
					N /= 11;
					e++;
				}
				if(N% 7 == 0){
					N/= 7;
					d++;
				}
				if(N% 5 == 0){
					N/= 5;
					c++;
				}
				if(N% 3 == 0){
					N/= 3;
					b++;
				}
				if(N% 2 == 0){
					N/= 2;
					a++;
				}
			}
			bw.write("#"+tc+" "+a+" "+b+" "+c+" "+d+" "+e+"\n");
		}
		bw.flush();
	}
}
