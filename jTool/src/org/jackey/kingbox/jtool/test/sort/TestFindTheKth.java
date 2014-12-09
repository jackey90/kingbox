package org.jackey.kingbox.jtool.test.sort;

import org.jackey.kingbox.jtool.array.RandomTool;
import org.jackey.kingbox.jtool.inAndOut.JOutPrint;
import org.jackey.kingbox.jtool.sort.FindTheKth;

public class TestFindTheKth {
	public static void main(String[] args) {
		//int[] array = RandomTool.randomWithNoRepeat(2, 109, 5);
		int[] array = {19,	108, 29,	50,	21};
		JOutPrint.JPrint(array);
		System.out.println(FindTheKth.findTheKth(array, 2));
	}
}
