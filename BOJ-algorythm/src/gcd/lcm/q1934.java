package gcd.lcm;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
//최대공약수GCD를 구한후 getGCD(x,y)
//두수 x,y의 곱을 GCD로 나누면 최소공배수가됨
public class q1934  {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int T = Integer.parseInt(br.readLine());
		for(int i=0; i<T; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int A = Integer.parseInt(st.nextToken());
			int B = Integer.parseInt(st.nextToken());
			
			int gcd = getGCD(A,B);
			bw.write(A*B/gcd + "\n");
		}
		bw.flush();
		
	}
	public static int getGCD(int x, int y) {
		if(y>x) {
			int temp = x;
			x = y;
			y = temp;
		}
		while(x%y!=0) {
			int t = x%y;
			x = y;
			y = t;
		}
		return y;
	}
}
