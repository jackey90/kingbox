package org.jackey.kingbox.jtool.test.sort;

import org.jackey.kingbox.jtool.array.RandomTool;
import org.jackey.kingbox.jtool.inAndOut.JOutPrint;
import org.jackey.kingbox.jtool.sort.FindTheKth;

public class TestFindTheKth {
	public static void main(String[] args) {
		int[] array = RandomTool.randomWithNoRepeat(2, 109, 60);
		JOutPrint.JPrint(array);
		for (int i = 1; i <= array.length; i++)
			System.out.println(FindTheKth.findTheKth(array, i));
	}
}
