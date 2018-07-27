package gugudan;

import java.util.Scanner;



public class gugudan08 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		String value = scanner.nextLine();
		
		String[] splitedValue = value.split(",");
		int first = Integer.parseInt(splitedValue[0]);
		int second = Integer.parseInt(splitedValue[1]);
		
		
		gugudan07.print(gugudan06.cal(first,second));
		
	}
}
