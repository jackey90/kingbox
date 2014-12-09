package org.jackey.kingbox.jtool.sort;

/**
 * Find The Kth number �ҵ���k�������
 * 
 * @author jackey90 2013-4-24
 */
public class FindTheKth {

	/**
	 * divide the array[low to high] into two parts by the lowest element in the
	 * array 
	 * @param array
	 * @param low
	 * @param high
	 * @return the right place of the array[low] 2013-4-24
	 */
	public static int partition(int[] array, int low, int high) {
		int result = array[low];
		int i = low + 1;
		int j = high;

		while (i < j) {
			while (i <= high && array[i] < result)
				i++;
			while (j >= low && array[j] > result)
				j--;

			if (i < j) {
				int temp = array[i];
				array[i] = array[j];
				array[j] = temp;
			}
		}
		array[low] = array[j];
		array[j] = result;

		return j;
	}

	/**
	 * find the kth number
	 * 
	 * @param array
	 * @param low
	 * @param high
	 * @param k
	 *            which number should be found
	 * @return the kth number 2013-4-24
	 */
	public static int findTheKth(int[] array, int low, int high, int k) {
		int temp = partition(array, low, high);
		if (high + 1 - temp == k)
			return array[temp];
		else if (high + 1 - temp < k)
			return findTheKth(array, low, temp, k - high + temp);
		else
			return findTheKth(array, temp + 1, high, k);
	}

	/**
	 * find the kth Integer
	 * 
	 * @param array
	 * @param k
	 * @return 2013-4-24
	 */
	public static int findTheKth(int[] array, int k) {
		return findTheKth(array, 0, array.length - 1, k);
	}
}
