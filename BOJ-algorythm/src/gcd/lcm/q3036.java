package gcd.lcm;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class q3036 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		int arr[] = new int[n];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0; i<n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		for(int i=1; i<n; i++) {
			int gcd = getGCD(arr[0], arr[i]);
			bw.write(arr[0]/gcd +"/"+ arr[i]/gcd +"\n");
		}
		bw.flush();
	}
	public static int getGCD(int a, int b) {
		if(b>a) {
			int temp = b;
			b = a;
			a = temp;
		}
		while(a%b!=0) {
			int t = a%b;
			a = b;
			b = t;
		}
		return b;
	}
	
}
