package stage12;

import java.util.Scanner;
/*
 * ���丮���ε� 0�� ������ ã�� ����
 * 2�� 5�� ������������ 0�� �����ǹǷ� ��� ���ڸ� �� �ʿ����
 * n�� ���� 2�� ����� 5�ǹ���� ã�Ƽ� ������ �������� 0�� ������
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
