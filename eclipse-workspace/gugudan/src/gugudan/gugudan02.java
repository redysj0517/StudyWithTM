package gugudan;

import java.util.Scanner;

public class gugudan02 {

	
	public static void main(String[] args) {
		
		int result = 4*1;
		System.out.print(result);
		result = 4*2;
		System.out.print(result);
		result = 4*3;
		System.out.print(result);
		result = 4*4;
		System.out.print(result);
		result = 4*5;
		System.out.print(result);
		result = 4*6;
		System.out.print(result);
		result = 4*7;
		System.out.print(result);
		result = 4*8;
		System.out.print(result);
		result = 4*9;
		System.out.print(result);
		
		System.out.println("4단의 원하는 숫자를 입력하세요");
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		
		System.out.println(number*4);
		
	}
}
