package stage10;

import java.io.IOException;
import java.util.Scanner;

public class q1929 {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		boolean res[] = new boolean[B + 1];
		for (int i = 2; i <= B; i++)
			res[i] = true;

		for (int i = 2; i < Math.sqrt(B); i++) {
			if (res[i]) {
				for (int j = 2; i * j <= B; j++) {
					res[i * j] = false;
				}
			}
		}
		for (int i = A; i <= B; i++)
			if (res[i])
				System.out.println(i);

	}
}
