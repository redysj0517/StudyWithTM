package stage9;

import java.util.Arrays;
import java.util.Scanner;

public class q2108 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); // �ݺ�Ƚ��
		int[] s = new int[n]; // �Է¹޴� ����
		int[] m = new int[8001]; // �ֺ� �迭
		

		int sum = 0;
		int count = 0; //

		for (int i = 0; i <= n - 1; i++) {

			s[i] = sc.nextInt();

		}

		for (int i = 0; i < n ; i++) {

			sum += s[i];
		}
		System.out.println((int)Math.round((double) sum / (double) n));// ������

		Arrays.sort(s);// �迭 ����

		int median = (int) Math.round((double) n / 2);
		if (n % 2 == 0) {
			System.out.println(((s[median - 1] + s[median])/2)+1);
		}
		else
			System.out.println(s[median - 1]);// �߾Ӱ�

		int x = 0;
		for (int i = 0; i <= n - 1; i++) { // �ֺ�
			m[s[i] + 4000]++;
			x = Math.max(x, m[s[i] + 4000]);

		}
		int second = 0;
		for (int i = 0; i < m.length; i++) {// -4000(+4000) ~ 4000(+4000)

			if (m[i] == x) {
				count++;
				second = i - 4000;

			}
			if (count == 2) {
				second = i - 4000;
				break;
			}

		}

		System.out.println(second);

		int max = s[0];
		int min = s[0];

		for (int i = 0; i <= s.length - 1; i++) {

			if (s[i] >= max) {
				max = s[i];
			}

		}
		for (int i = 0; i <= n - 1; i++) {
			if (s[i] <= min) {
				min = s[i];
			}
		}
		
		System.out.println(max - min);
	}

}
