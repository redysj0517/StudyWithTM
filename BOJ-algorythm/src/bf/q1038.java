package bf;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
/*
 * 단순 노가다인 완탐으로 한 방법.
 * 하지만 시간초과가 나기 쉽상이다.
 * 다른 방법이 필요할 것 같다.
 */

public class q1038 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());
		int count = 0;
		int temp = 0;
		while (true) {
			if (count == N) {
				break;
			}
			char str[] = Integer.toString(temp).toCharArray();
			if (str.length == 1) {
				count++;
				temp++;
			} else {
				boolean flag = true;
				for (int i = 1; i < str.length; i++) {
					if (str[i] >= str[i - 1]) {
						flag = false;
						break;
					}
				}
				if (flag)
					count++;
				temp++;
			}
		}
		bw.write(temp+"");
		bw.flush();
	}
}
