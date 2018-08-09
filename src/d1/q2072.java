package d1;

import java.io.IOException;
import java.util.Scanner;

/*
 * 홀수만 더하기
 */
public class q2072 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int sum = 0;
		for(int testcase = 1; testcase <=T; testcase++){
			sum = 0;
			for(int i=0; i<10; i++){
				int temp = sc.nextInt();
				if(temp%2==1){
					sum+=temp;
				}
			}
			System.out.println("#"+testcase+" "+sum);
		}
	}
}
