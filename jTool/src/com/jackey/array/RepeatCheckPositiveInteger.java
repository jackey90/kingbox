package com.jackey.array;

/**
 * @author jackey90
 *	2013-4-23
 */
public class RepeatCheckPositiveInteger {

	/**
	 * if the one-dimensional array has repetition, return true; otherwise
	 * return false.
	 * 一维数组若含有重复值,返回true;否则false.
	 * 思路：生成数组int[max],初始都为0,检查过的数字对应数组位置设为1,若未检查数字中对应位置有非0值,则此数字重复.
	 * 
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
