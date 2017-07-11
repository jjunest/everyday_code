import java.util.Scanner;

public class No2750 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		int totalInput = scan.nextInt();

		int[] in_number_array = new int[totalInput];
		int[] result_number_array = new int[totalInput];

		for (int i = 0; i < totalInput; i++) {
			in_number_array[i] = scan.nextInt();
		}

		// (sort1) bubble sort
		// 버블소트는 끝에서부터 정렬이 되니, 처음이 아니고 마지막 loop를 줄여주면서 나가야 한다. 그리고 마지막 루프는 한 번 안돌아도 된다는
		// 점을 잊으면 안된다.
		// for (int j = 0; j < totalInput - 1; j++) {
		// for (int k = 0; k < totalInput-1-j; k++) {
		// if (in_number_array[k] > in_number_array[k + 1]) {
		// int temp = in_number_array[k];
		// in_number_array[k] = in_number_array[k + 1];
		// in_number_array[k + 1] = temp;
		// }
		// }
		// }

		// (sort2)selection sort
		// 바꾸는 것이 아니고 선택만 하라고 했다. 가장 작은것을 선택.
		// 처음을 가장 작은 것이라고 판단하고, 그 다음것중에서 가장 작은 것을 선택(not swap!)한 후에 바꿔준다.
		// for (int j = 0; j < totalInput - 1; j++) {
		// int selected = j;
		// int min = in_number_array[j];
		// for (int k = j + 1; k < totalInput; k++) {
		// if (min > in_number_array[k]) {
		// min = in_number_array[k];
		// selected = k;
		// }
		// }
		// int temp = in_number_array[j];
		// in_number_array[j] = in_number_array[selected];
		// in_number_array[selected] = temp;
		// }

		// (sort3)insertion sort
		// 기준을 정하고, 오른쪽으로 밀면서 마지막 위치에 적당한 자리를 찾아서 넣어줌
		// 중요한 점은 && 연산 위치이다 => index 가 -1이 되기 때문에 먼저 체크를 해주는 것이 && 앞에 와야 한다. 
		for (int i = 1; i < totalInput; i++) {
			int insertion = in_number_array[i];
			int compare_index=i-1;
			while (compare_index>=0&&insertion<in_number_array[compare_index]) {
				in_number_array[compare_index+1] = in_number_array[compare_index];
								
				compare_index--;
			}
			
			in_number_array[compare_index+1] = insertion;
			

		}

		// resultcheck
		for (int i = 0; i < totalInput; i++) {
			System.out.println(in_number_array[i]);
		}

	}

}
