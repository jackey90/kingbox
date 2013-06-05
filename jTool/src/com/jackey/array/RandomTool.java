package com.jackey.array;

import java.util.Random;

/**
 * @author jackey90
 * 2013-4-23
 */
public class RandomTool {
	
	/**
	 * to random count numbers in [start,end), without repetition
	 * [start,end)范围内random出count个值
	 * 思路：先生成顺序排列的数组，然后随机一个位置，用最后的元素和随机位置元素对换
	 * @param start  start with this number
	 * @param end  end by this number(without this number)
	 * @param count  random count numbers
	 * @return  int[count]
	 * 2013-4-24
	 */
	public static int[] randomWithNoRepeat(int start, int end, int count) {
		int[] result = new int[count];
		int[] array = new int[end - start];
		for (int i = start; i < end; i++) {
			array[i - start] = i;
		}

		Random r = new Random();
		int randomTemp;
		int last = end - start;
		
		for (int j = 0; j < count; j++) {
			randomTemp = r.nextInt(last);
			result[j] = array[randomTemp];
			array[randomTemp] = array[--last];
		}
		return result;
	}
}
