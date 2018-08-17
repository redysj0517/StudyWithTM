package d2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class q1976 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int T = Integer.parseInt(br.readLine());
		for(int tc =1; tc<=T; tc++){
			int rS,rM;
			String str[] = br.readLine().split(" ");
			int s1 = Integer.parseInt(str[0]);
			int m1 = Integer.parseInt(str[1]);
			int s2 = Integer.parseInt(str[2]);
			int m2 = Integer.parseInt(str[3]);
			rM = m1+m2;
			rS = s1+s2;
			if(rM>=60){
				rM-=60;
				rS+=1;
			}
			if(rS>12){
				rS-=12;
			}
			bw.write("#"+tc+" "+rS+" "+rM+"\n");
		}
		bw.flush();
	}
}
