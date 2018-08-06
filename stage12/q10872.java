package stage12;

import java.util.Scanner;
/*
 * 팩토리얼인데 0의 갯수를 찾는 문제
 * 2와 5로 곱해져있으면 0이 생성되므로 모든 숫자를 할 필요없이
 * n의 값을 2의 배수와 5의배수만 찾아서 갯수가 적은쪽이 0의 갯수임
 */
public class q10872 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int five = 0;
		int two = 0;
		int temp =0;
		for(int i=2; i<=n; i*=2){
			two+=n/i;
		}
		for(int i=5; i<=n; i*=5){
			five+=n/i;
		}
		System.out.println((two<five)? two : five);
	}
}
