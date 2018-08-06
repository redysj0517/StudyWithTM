package study;

/*
 * ũ�Ⱑ 5�� ���� arr���� r�� 3���� �̴� ��츦 ����ϴ� �ڵ�
 * arr[0]���� arr[4]���� ���� �ɴ� ���, �Ȼ̴� ����� ���� ��� ����
 * combArr�� ��迭�ε� ���� ���Ҹ� ���⿡ �����Ѵ�.
 * (i) arr[target] ���Ҹ� �̴� ����̰�
 * (ii) arr[target]���Ҹ� �Ȼ̴� ���
 * �̷��ٰ� �ٻ̾��� ��� r=0�� �ȴ�.
 * �̶� ��¸���.
 * r���� �ٻ̾Ҵµ� arr�� ���Ұ� ���� ���
 * r�� �� �̾Ҵµ� arr�� ������ �����Ƿ� �̷� ��� �����̹Ƿ� �׳� �Ѿ��.
 */
public class Combination {
	public static void main(String[] args) {
		Combination ex = new Combination();
		int arr[] = {1, 3, 5, 7, 9};
		int n = arr.length;
		int r = 3;
		int [] combArr = new int[n];
		
		ex.doCombination(combArr, n, r, 0, 0, arr);
	}
	
	public void doCombination(int combArr[], int n, int r, int index, int target, int[] arr){
		
		if(r==0){
			for(int i=0; i<index; i++){
				System.out.println(arr[combArr[i]]+" ");
				System.out.println();
			}
		}else if(target ==n){
			return;
		}else{
			combArr[index] = target;
			doCombination(combArr, n, r-1, index+1, target+1, arr); // i
			doCombination(combArr, n, r, index, target+1, arr);
		}
	}
}
