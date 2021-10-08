import java.util.Arrays;
import java.util.Collections;

class solution {
	public static int kthLargest(Integer[] arr,	int k)
	{
		Arrays.sort(arr);

		return arr[arr.length-k];
	}

	public static void main(String[] args)
	{
		Integer arr[] = new Integer[] { 14, 3, 4, 7, 32 };
		int k = 2;
		System.out.print("K'th largest element is " + kthLargest(arr, k));
	}
}

