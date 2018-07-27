package gugudan;
import javax.swing.JOptionPane;
import java.util.ArrayList;


public class calculator {

	public static void main(String[] args) {
		
		String modify = JOptionPane.showInputDialog("수식을 입력하세요"+ "\n" + "(사칙연산이 가능합니다. 괄호 기능은 아직 개발중입니다)" );
		String[] ini = new String[modify.length()]; 
		
		
		// 숫자와 수식을 배열로 저장하기 위해 List선언 (각각 갯수를 확정할 수 없기 때문에 List이용 )
		ArrayList<Double> num = new ArrayList<>();
		ArrayList<String> cal = new ArrayList<>();
		
		
		int before = 0;		
		int j = 0;
		
		for(int i = 0; i<modify.length();i++) {
			ini[i] = String.valueOf(modify.charAt(i)); //수식을 모두 문자열 배열에 입력시킨다. (String형으로 바꾸기 위해 charAt사용)
			
			 //입력된 수식을 숫자 - 수식으로 나눠 각각 List에 저장 
			if(ini[i].contains("+") == true || ini[i].contains("-") == true || ini[i].contains("*") == true || ini[i].contains("/") == true) {
				num.add(Double.parseDouble((modify.substring(before, i))));
				cal.add(modify.substring(i,i+1));				
				before=i+1;
				j++;
			}
		}
		num.add(Double.parseDouble((modify.substring(before,modify.length()))));		
		
		
		
		
		double result = 0;
		//사칙연산을 위해 곱하기와 나누기를 먼저 계산하고, List를 재 배열한다.
		for(int i = 0; i<cal.size();i++) {
			switch(cal.get(i)){
			case "*" :
				num.set(i, num.get(i)*num.remove(i+1));
				cal.remove(i);
				i--;
				break;
			case "/" :
				num.set(i, num.get(i)/num.remove(i+1));
				cal.remove(i);
				i--;
				break;
			}
			
			
		}
		
		
		result = num.get(0);	
		//나머지 더하기와 빼기를 계산한다.
		for(int i =0; i<cal.size(); i++) {
			
			switch(cal.get(i)) {
				
				case "+": result = result + num.get(i+1);
				break;
				case "-": result = result - num.get(i+1);		
				break;	
					 	
			
			}
			
			
		}
		System.out.println(result);
	
			
	}
	
	
	
	
	
	
}
