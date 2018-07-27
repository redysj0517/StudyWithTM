package stage6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class q1152 {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int count = 0;
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		System.out.println(st.countTokens());
	}
}
