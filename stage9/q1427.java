package stage9;

import java.util.Arrays;
import java.util.Scanner;

public class q1427 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String a = sc.nextLine();
		
		char[] arr = a.toCharArray();
		Arrays.sort(arr);
		for(int i=arr.length-1; i>=0; i--){
			System.out.print(arr[i]);
		}
	}
}
