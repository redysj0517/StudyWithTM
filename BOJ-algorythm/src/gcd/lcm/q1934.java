package gcd.lcm;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
//�ִ�����GCD�� ������ getGCD(x,y)
//�μ� x,y�� ���� GCD�� ������ �ּҰ��������
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
