package study;

/*
 * 크기가 5인 수열 arr에서 r인 3개를 뽑는 경우를 출력하는 코드
 * arr[0]부터 arr[4]까지 돌며 뽄느 경우, 안뽑는 경우의 수를 모두 조사
 * combArr은 빈배열인데 뽑은 원소를 여기에 저장한다.
 * (i) arr[target] 원소를 뽑는 경우이고
 * (ii) arr[target]원소를 안뽑는 경우
 * 이러다가 다뽑았을 경우 r=0이 된다.
 * 이땐 출력만함.
 * r개를 다뽑았는데 arr의 원소가 남은 경우
 * r은 다 뽑았는데 arr이 끝까지 갔으므로 이런 경우 실패이므로 그냥 넘어간다.
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
