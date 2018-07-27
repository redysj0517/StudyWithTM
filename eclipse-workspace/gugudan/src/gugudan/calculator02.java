package gugudan;
import javax.swing.JOptionPane;
import java.util.ArrayList;

public class calculator02 {

	
	public static void main(String[] args) {
		String modify = JOptionPane.showInputDialog("수식을 입력하세요");
		String[] eleArr = new String[modify.length()];
		
		for(int i = 0; i<modify.length(); i++) {
			eleArr[i] = modify.substring(i, i+1);
			
			System.out.println(Integer.parseInt(eleArr[i]));
		}
		
		
		
		
		
		
		
		
	}
	
}
