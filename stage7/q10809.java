package stage7;

import java.io.IOException;
import java.util.Scanner;

public class q10809 {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		
		String a = sc.nextLine();
		int arr[] = new int[26];
		for(int i=0; i<arr.length; i++){
			arr[i] = -1;
		}
		// a = 97 z==122
		for(int i=0; i< a.length(); i++){
			if(arr[(a.charAt(i)-97)] == -1)
				arr[(a.charAt(i)-97)] = i;
		}
		for(int i=0; i<arr.length; i++)
			System.out.print(arr[i]+" ");
	}
}
