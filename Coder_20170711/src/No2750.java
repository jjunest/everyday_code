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
		// �����Ʈ�� ���������� ������ �Ǵ�, ó���� �ƴϰ� ������ loop�� �ٿ��ָ鼭 ������ �Ѵ�. �׸��� ������ ������ �� �� �ȵ��Ƶ� �ȴٴ�
		// ���� ������ �ȵȴ�.
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
		// �ٲٴ� ���� �ƴϰ� ���ø� �϶�� �ߴ�. ���� �������� ����.
		// ó���� ���� ���� ���̶�� �Ǵ��ϰ�, �� �������߿��� ���� ���� ���� ����(not swap!)�� �Ŀ� �ٲ��ش�.
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
		// ������ ���ϰ�, ���������� �и鼭 ������ ��ġ�� ������ �ڸ��� ã�Ƽ� �־���
		// �߿��� ���� && ���� ��ġ�̴� => index �� -1�� �Ǳ� ������ ���� üũ�� ���ִ� ���� && �տ� �;� �Ѵ�. 
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
