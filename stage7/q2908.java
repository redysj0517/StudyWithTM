package stage7;

import java.util.Scanner;

public class q2908 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int newA = SangSu(a);
		int newB = SangSu(b);
		if(newA>newB){
			System.out.println(newA);
		}else if(newB>newA){
			System.out.println(newB);
		}
		sc.close();
	}
	
	public static int SangSu(int num){
		int temp_a = num/100;
		int temp_b = (num%100)/10;
		int temp_c = num%10;
		return temp_c*100 + temp_b*10 + temp_a;
	}
}
