package gcd.lcm;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class q1850 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		long a = Long.parseLong(st.nextToken());
		long b = Long.parseLong(st.nextToken());
		
		for(int i=0; i<getGCD(a,b); i++) {
			bw.write("1");
		}
		bw.flush();
	}
	public static long getGCD(long a, long b) {
		if(b>a) {
			long temp  = a;
			a = b;
			b = temp;
		}
		while(a%b!=0) {
			long t = a%b;
			a = b;
			b = t;
		}
		return b;
	}
}
