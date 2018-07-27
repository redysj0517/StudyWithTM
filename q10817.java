package stage4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class q10817 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String str = br.readLine();
		StringTokenizer st = new StringTokenizer(str, " ");
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());
		int res = 0;
		
		if(a>=b && a>=c){
			if(b>=c)
				res = b;
			else
				res = c;
		}else if(b>=a && b>=c){
			if(a>=c)
				res = a;
			else
				res = c;
		}else if(c>=a && c>=b){
			if(a>=b)
				res = a;
			else
				res = b;
		}
		System.out.println(res);
	}
}
