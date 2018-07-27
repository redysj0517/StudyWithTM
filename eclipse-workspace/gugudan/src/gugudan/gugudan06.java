package gugudan;

public class gugudan06 {

	public static int[][] cal(int times,int times2) {
		
		int[][] result = new int[times][times2];
		
		for(int i = 0; i < times;i++) {
			for(int j =0 ; j <times2;j++) {
				result[i][j] = (i+1)*(j+1);	
			}
			
		}
		
		return result;
	}
	
}
