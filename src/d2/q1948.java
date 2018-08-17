package d2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class q1948 {
	static int date[] = {31,28,31,30,31,30,31,31,30,31,30,31};
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int T = Integer.parseInt(br.readLine());
		for(int tc = 1; tc <= T; tc++){
			int res = 0;
			String str[] = br.readLine().split(" ");
			int m1 = Integer.parseInt(str[0]);
			int d1 = Integer.parseInt(str[0]);
			int m2 = Integer.parseInt(str[0]);
			int d2 = Integer.parseInt(str[0]);
			
			if(m1 == m2){
				res = d2 - d1 + 1;
			}else{
				res = date[m1-1] - d1 + 1;
				m1++;
				while(m1 != m2){
					res += date[m1 -1];
					m1++;
				}
				res += d2;
			}
			bw.write("#"+tc+" "+res+"\n");
		}
		bw.flush();
	}
}
