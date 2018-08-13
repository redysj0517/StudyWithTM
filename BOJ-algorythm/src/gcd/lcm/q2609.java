package gcd.lcm;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class q2609 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		
		int gcd = getGCD(a,b);
		int lcd = a*b/gcd;
		bw.write(gcd+"\n");
		bw.write(lcd+"\n");
		bw.flush();
	}
	public static int getGCD(int a, int b) {
		if(b>a) {
			int temp = a;
			a = b;
			b = temp;
		}
		while(a%b!=0) {
			int t = a%b;
			a = b;
			b = t;
		}
		return b;
	}
}
