package stage8;

import java.util.Scanner;

public class q2292 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int st = 1;
		int count = 1;
		int cd = 0;
		while(st<N){
			count++;
			st = st + 6*(count-1);
		}
		System.out.println(count);
	}
}

/*
 * 
 * 
 * 
 * 
 * 
 */
