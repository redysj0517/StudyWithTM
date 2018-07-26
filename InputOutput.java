package stage1;

import java.util.Scanner;

public class InputOutput {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNextLine()) {
			String out = sc.nextLine();
			System.out.println(out);
		}
	}
}
