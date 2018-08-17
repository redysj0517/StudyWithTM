package d2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/*
 * 펠린드롬
 */
public class q1989 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int T = Integer.parseInt(br.readLine());
		
		for(int tc = 1; tc<=T; tc++){
			String str = br.readLine();
			boolean flag = true;
			for(int i=0; i<str.length()/2;i++){
				if(str.charAt(i)!=str.charAt(str.length()-i-1))
					flag = false;
			}
			if(flag){
				bw.write("#"+tc+" "+1+"\n");
			}else{
				bw.write("#"+tc+" "+0+"\n");
			}
		}
		bw.flush();
	}
}
