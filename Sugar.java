package stage1;

import java.util.Scanner;
 
public class Sugar {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int five = 0;
		int three = 0;
		int count = 0;

		while (N > 2) {
			if (N % 5 != 0) {
				N = N - 3;
				three++;
			}
			if( N % 5 == 0){
				five = N/5;
				N = 0;
			}
		}
		if(N%3!=0)
			count = -1;
		else
			count = five + three;
		System.out.println(count);
	}
}
