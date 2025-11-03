import java.util.Arrays;
public class PracticeProblem {

	public static void main(String args[]) {

	}
	public static int[] compareSearch(int[] array, int number) {
		int seqLoops = 0;
		int binLoops = 0;
		for (int i = 0; i < array.length; i++) {
			seqLoops++;
			if (array[i] == number) {
				break;
			}
		}
		Arrays.sort(array);
		int low = 0;
		int high = array.length - 1;

		while (low<= high) {
			binLoops++;
			int mid = (low + high) / 2;
			if (array[mid] == number) {
				break;
			} else if (array[mid] < number) {
				low = mid + 1;
			} else {
				high = mid - 1;
			}
		}
		return new int[] {seqLoops, binLoops};
	}
	public static int[]
	compareStringSearch(String[] array, String word) {
		int seqLoops = 0;
		int binLoops = 0;
		for (int i = 0; i < array.length; i++) {
			seqLoops++;
			if (array[i].equals(word)) {
				break;
			}
		}
		Arrays.sort(array);
		int low = 0;
		int high = array.length - 1;

		while (low <= high) {
			binLoops++;
			int mid = (low + high) / 2;
			int compare = array[mid].compareTo(word);
			if (compare == 0) {
				break;
			} else if (compare < 0) {
				low = mid + 1;
			} else {
				high = mid - 1;
			}
		}
		return new int[] {seqLoops, binLoops};
	}
}