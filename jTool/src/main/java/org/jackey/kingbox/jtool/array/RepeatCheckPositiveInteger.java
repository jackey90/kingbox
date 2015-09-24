package org.jackey.kingbox.jtool.array;

/**
 * @author jackey90
 *	2013-4-23
 */
public class RepeatCheckPositiveInteger {

	/**
	 * if the one-dimensional array has repetition, return true; otherwise
	 * return false.
	 * @param array
	 *            the array to be checked(one-dimensional, coutinuous)
	 * @param max
	 *            the max value in the array(or a bigger number)
	 * @return
	 * 2013-4-23
	 */
	public static boolean oneDimArrayCheck(int[] array, int max) {
		int[] check = new int[max];
		for (int i : array) {
			if (check[i - 1] != 0) {
				return true;
			} else {
				check[i - 1] = 1;
			}
		}
		return false;
	}

	/**
	 * if the one-dimensional continuous array has repetition, return true;
	 * otherwise return false.
	 * 
	 * @param array
	 *            one-dimensional, positive
	 * @return
	 * 2013-4-23
	 */
	public static boolean oneDimContinueArrayCheck(int[] array, int start) {
		int length = array.length;
		int[] check = new int[length];
		for(int i: array){
			if(check[i - start] != 0){
				return true;
			}else{
				check[i - start] = 1;
			}
		}
		return false;
	}
}
