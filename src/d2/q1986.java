package d2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class q1986 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int T = Integer.parseInt(br.readLine());
		for(int tc = 1; tc<=T; tc++){
			int temp = Integer.parseInt(br.readLine());
			int res = 0;
			for(int i=1; i<=temp; i++){
				if(i%2==1){
					res+=i;
				}else{
					res-=i;
				}
			}
			bw.write("#"+tc+" "+res+"\n");
		}
		bw.flush();
	}
}
