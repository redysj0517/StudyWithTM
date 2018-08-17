package d2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class q1974 {
	static int arr[][] = new int[9][9];
	static int a= 0;
	static int b= 0;
	static int sum;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int T = Integer.parseInt(br.readLine());
		for (int tc = 1; tc <= T; tc++) {
			
			for (int i = 0; i < 9; i++) {
				String str[] = br.readLine().split(" ");
				for (int j = 0; j < 9; j++) {
					arr[i][j] = Integer.parseInt(str[j]);
				}
			}
			outerloop:
			if (GaroCheck(arr) && SeroCheck(arr)) {
				for (int i = 0; i <= 6; i = i + 3) {
					for (int j = 0; j <= 6; j = j + 3) {
						if (gridCheck(arr, i, j) == false) {
							bw.write("#" + tc + " 0" + "\n");
							break outerloop;
						}
					}
				}
				bw.write("#" + tc + " 1" + "\n");
			} else {
				bw.write("#" + tc + " 0" + "\n");
			}

		}
		bw.flush();

	}

	public static boolean GaroCheck(int arr[][]) {
		sum = 0;
		b=0;
		for (a = 0; a < 9; a++) {
			for (b = 0; b < 9; b++) {
				sum += arr[a][b];
			}
			if (sum != 45) {
				return false;
			} else {
				sum = 0;
			}
		}
		return true;
	}

	public static boolean SeroCheck(int arr[][]) {
		sum = 0;
		b=0;
		for (a = 0; a < 9; a++) {
			for (b = 0; b < 9; b++) {
				sum += arr[a][b];
			}
			if (sum != 45) {
				return false;
			} else {
				sum = 0;
			}
		}
		return true;
	}
	public static boolean gridCheck(int arr[][], int a1, int a2){
		sum = 0;
		for(int i=a1; i<a1+3; i++){
			for(int j=a2; j<a2+3; j++){
				sum = sum + arr[i][j];
			}
		}
		if(sum!=45){
			return false;
		}else
			return true;
	}
}
