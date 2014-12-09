package org.jackey.kingbox.jtool.sort;

/**
 * some classic sort algorithms, the defult result is from small to large
 * 
 * @author jackey90 2013-4-27
 */
public class ClassicSort {

	/**
	 * Bubble Sort O(n^2)
	 * 
	 * @param array
	 * @return 2013-4-27
	 */
	public static int[] bubbleSort(int[] array) {
		for (int i = 0; i < array.length - 1; i++) {
			for (int j = 0; j < array.length - i - 1; j++) {
				if (array[j] > array[j + 1]) {
					swap(array, j, j + 1);
					// int temp = array[j];
					// array[j] = array[j+1];
					// array[j+1] = temp;
				}
			}
		}
		return array;
	}

	/**
	 * SelectionSort O(n^2)
	 * 
	 * @param array
	 * @return 2013-4-27
	 */
	public static int[] selectionSort(int[] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[j] < array[i]) {
					swap(array, j, i);
				}
			}
		}
		return array;
	}
	
	/**
	 * @param array
	 * @param start
	 * @param offset
	 * @return
	 * @date 2013-5-14
	 */
	public static int[] insertionSort(int[] array, int start, int offset){
		for(int i = start + offset; i < array.length; i += offset){
			int temp = array[i];
			int j = i;
			while(j >= offset && temp < array[j - offset]){
				array[j] = array[j - offset];
				j -= offset;
			}
			array[j] = temp;
		}
		return array;
	}

	/**
	 * InsertionSort O(n^2) codeע�⣺ �ж�����ʱ����j>0 д��j-1ǰ�棡
	 * ˼·��ȡ��ĳ�����֮ǰ������õ�������Ƚϣ���������
	 * @return 2013-5-3
	 */
	public static int[] insertionSort(int[] array) {
//		for (int i = 1; i < array.length; i++) {
//			int temp = array[i];
//			int j = i;
//			while (j > 0 && temp < array[j - 1]) {
//				array[j] = array[j - 1];
//				j--;
//			}
//			array[j] = temp;
//		}
//		return array;
		
		
		return insertionSort(array, 0, 1);
	}
	

	/**
	 * divide the array[low to high] into two parts by the lowest element in the
	 * array �������[low,high]���ַ�Ϊ�������֣����ض�Ӧ��lowֵ�������е�λ��
	 * 
	 * @param array
	 * @param start
	 * @param end
	 * @return the right place of the array[low]
	 * @date 2013-5-3
	 * 
	 */
	public static int partitionSort(int[] array, int start, int end) {
		return FindTheKth.partition(array, start, end);
	}

	/**
	 * QuickSort O(nlogn)
	 * 
	 * @param array
	 * @param start
	 * @param end
	 * @return
	 * @date 2013-5-3
	 */
	public static int[] quickSort(int[] array, int start, int end) {
		if (start > end) {
			return array;
		}
		int index = partitionSort(array, start, end);
		// sort the side smaller
		partitionSort(array, start, index - 1);
		// sort the side larger than index
		partitionSort(array, index + 1, end);

		return array;
	}

	/**
	 * QuickSort O(nlogn)
	 * @param array
	 * @return
	 * @date 2013-5-3
	 */
	public static int[] quickSort(int[] array) {
		return quickSort(array, 0, array.length - 1);
	}

	/**
	 * ShellSort
	 * ˼·��	ʵ��Ϊ�Ľ�Ĳ�������
	 * 		�����鳤�ȵĶ���Ϊ�������������в�������֪�����Ϊ1Ϊֹ�������Ϊһʱ����������źá�
	 * @param array
	 * @return
	 * @date 2013-5-14
	 */
	public static int[] shellSort(int[] array){
		int length = array.length;
		for(int i = length/2; i > 2; i = i/2){
			for(int j = 0; j < i; j++){
				insertionSort(array, j, i);
			}
		}
		insertionSort(array, 0, 1);
		return array;
	}
	
	/**
	 * swap the array[m] and array[n] ���봫����������Լ������Ӧ�±��ֵ����ֻ�ǵ�������intֵ��
	 * 
	 * @param m
	 * @param n
	 *            2013-4-27
	 */
	public static void swap(int[] array, int m, int n) {
		int temp = array[m];
		array[m] = array[n];
		array[n] = temp;
	}
}
