package stage6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class q2920 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine());
		int arr[] = new int[st.countTokens()];
		int res[] = new int[st.countTokens()];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		for (int i = 1; i < arr.length; i++) {
			res[i - 1] = arr[i] - arr[i - 1];
		}
		int temp = 0;
		boolean flag = true;
		String result = null;
		temp = res[0];
		for (int i = 1; i < res.length - 1; i++) {
			if (temp == res[i]) {
				if (res[i] == 1) {
					result = "ascending";
					flag = true;
				} else {
					result = "descending";
					flag = true;
				}
			} else {
				result = "mixed";
				flag = false;
				break;
			}
		}
		System.out.println(result);
	}
}
