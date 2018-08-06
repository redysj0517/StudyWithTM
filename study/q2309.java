package study;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class q2309 {
	/*
	 * 9���� ��δ� ���ϰ� 2�����̾Ƽ� ������ 100�̸� ����
	 */
	public static void main(String[] args) throws NumberFormatException, IOException {
		int n = 9;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int mem[] = new int[n];
		int sum = 0;
		for (int i = 0; i < n; i++) {
			mem[i] = Integer.parseInt(br.readLine());
			sum += mem[i];
		}
		Arrays.sort(mem);

		for (int i = 0; i < n - 1; i++) {
			for (int j = 1; j < n; j++) {
				if (sum - (mem[i] + mem[j]) == 100) {
					for (int k = 0; k < n; k++) {
						if (k == i || k == j)
							continue;
						System.out.println(mem[k]);
					}
					System.exit(0);
				}
			}
		}

	}
}
