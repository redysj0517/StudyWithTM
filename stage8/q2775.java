package stage8;

import java.io.IOException;
import java.util.Scanner;

public class q2775 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int testCase = 0; testCase < T; testCase++) {
			int k = sc.nextInt();
			int n = sc.nextInt();
			int sol = 0;
			int arr[][] = new int[k+1][n+1];
			for (int i = 0; i <= k; i++) {
				for (int j = 0; j <= n; j++) {
					if (i == 0) {
						int temp = j+1;
						arr[i][j] = temp;
					} else {
						if (j == 0) {
							arr[i][j] = arr[i-1][j];
						} else {
							for(int m=0; m<=j; m++){
								arr[i][j]+=arr[i-1][m];
							}
						}
					}
				}
			}
			System.out.println(arr[k][n-1]);
		}
	}
}
