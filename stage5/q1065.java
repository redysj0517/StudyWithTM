package stage5;

import java.util.Scanner;

public class q1065 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int count = 0;
		for (int i = 1; i <= N; i++) {
			if (isD(i))
				count++;
		}
		System.out.println(count);
	}

	public static boolean isD(int num) {
		int a, b, c = 0;
		//a,b,c는 0일 수도있음
		a = num / 100;
		b = (num / 10) %10;
		c = num % 10;
		
		if(num <100){
			return true;
		} else{
			if((a-b)==(b-c)){
				return true;
			}else
				return false;
		}
	}
}
