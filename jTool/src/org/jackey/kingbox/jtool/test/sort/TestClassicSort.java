package org.jackey.kingbox.jtool.test.sort;

import org.jackey.kingbox.jtool.array.RandomTool;
import org.jackey.kingbox.jtool.dateAndTime.time.JTimeFormat;
import org.jackey.kingbox.jtool.inAndOut.JOutPrint;
import org.jackey.kingbox.jtool.sort.ClassicSort;

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
