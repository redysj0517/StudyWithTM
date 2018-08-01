package stage8;

import java.util.Scanner;

public class q1193 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int X = sc.nextInt();
		int n = 1;
		int count = 1;
		int move = 0;
		int boonmo = 0;
		int boonja = 0;
		while (n < X) {
			count++;
			n = n + count;
		}
		n = n - count;
		move = X - n;
		if (count % 2 == 1) {
			boonmo = 1;
			boonja = count;
			while (move > 1) {
				move--;
				boonmo++;
				boonja--;
			}
		} else if (count % 2 == 0) {
			boonmo = count;
			boonja = 1;
			while (move > 1) {
				move--;
				boonmo--;
				boonja++;
			}
		}
		System.out.println(boonja + "/" + boonmo);
	}
}
