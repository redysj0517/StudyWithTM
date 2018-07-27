package stage4;

import java.util.Scanner;

public class q1110 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();
		int start = num;
		int count = 0;
		int ten;
		int ill;
		int temp;

		while(true){
			if (num < 10) {
				num = num * 10 + num;
			} else {
				ten = num / 10;
				ill = num % 10;
				temp  = (ten + ill) % 10;
				num = ill * 10 + temp;
			}
			count++;
			
			if(start==num)
				break;
		}
		
		System.out.println(count);
	}

}
