package com.jackey.test.sort;

import com.jackey.array.RandomTool;
import com.jackey.inAndOut.JOutPrint;
import com.jackey.sort.FindTheKth;

public class TestFindTheKth {
	public static void main(String[] args) {
		int[] array = RandomTool.randomWithNoRepeat(2, 109, 60);
		JOutPrint.JPrint(array);
		for (int i = 1; i <= array.length; i++)
			System.out.println(FindTheKth.findTheKth(array, i));
	}
}
