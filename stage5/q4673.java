package stage5;

public class q4673 {
	public static void main(String[] args) {

		boolean arr[] = new boolean[10001];
		
		for (int i = 1; i <= 10000; i++) {
			int dn = getDn(i);
			if( dn <= 10000){
				arr[dn] = true;
			}
		}
		for(int i=1; i< arr.length; i++){
			if(!arr[i]){
				System.out.println(i);
			}
		}
	}
	public static int getDn(int n){
		int dn = n;
		while(n>0){
			dn+= n%10;
			n /= 10;
		}
		return dn;
	}

}
