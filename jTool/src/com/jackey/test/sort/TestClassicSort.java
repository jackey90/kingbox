package com.jackey.test.sort;

import com.jackey.array.RandomTool;
import com.jackey.dateAndTime.time.JTimeFormat;
import com.jackey.inAndOut.JOutPrint;
import com.jackey.sort.ClassicSort;

/**
 * @author jackey90
 * @date 2013-5-3
 */
public class TestClassicSort {
	/**
	 * @param args
	 * @date 2013-5-3
	 */
	public static void main(String[] args) {
		int[] a = RandomTool.randomWithNoRepeat(2, 10000000, 6000000);
		Long start = System.currentTimeMillis();
//		ClassicSort.bubbleSort(a);
		// JOutPrint.JPrint(a);
		// JOutPrint.JPrint(ClassicSort.selectionSort(a));

//		 ClassicSort.insertionSort(a);
		 ClassicSort.shellSort(a);

		//ClassicSort.quickSort(a);
		// JOutPrint.JPrint(ClassicSort.insertionSort(a, 0, 1));

		Long end = System.currentTimeMillis();
		JOutPrint.JPrint(JTimeFormat.ms2hhmmssms(end - start));
	}
}
