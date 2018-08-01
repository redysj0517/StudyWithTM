package stage8;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class q10250 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		// h�� w�� 1~99����
		// int y , yy ����
		// xx�� ���������Ϳ������� ���������� ��ȣ
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int T = Integer.parseInt(br.readLine());

		for (int testCase = 0; testCase < T; testCase++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			int H = 0, W = 0, N = 0;
			while (st.hasMoreTokens()) {
				H = Integer.parseInt(st.nextToken());
				W = Integer.parseInt(st.nextToken());
				N = Integer.parseInt(st.nextToken());
				// H:����, W:���ǹ��, N:���°�մ�����
			}
			System.out.println(findRoomNumber(H, W, N));
		}
	}

	public static int findRoomNumber(int H, int W, int N) {
		int sol = 0;
		int h = 0, w = 0;
		int arr[][] = new int[H][W];
		for (int j = 0; j < W; j++) {
			for (int i = 0; i < H; i++) {
				if (N > 0) {
					N--;
				} else {
					h = i + 1;
					w = j + 1;
					break;
				}
			}
		}
		System.out.println(h);
		System.out.println(w);
		return sol;
	}
}
