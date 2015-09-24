package org.jackey.kingbox.jtool.test.array;

import org.jackey.kingbox.jtool.array.RandomTool;
import org.jackey.kingbox.jtool.dateAndTime.time.JTimeFormat;

/**
 * @author jackey90
 * 2013-4-24
 */
public class TestRandomTool {
	
	public static void main(String[] args) {
		Long sTime = System.currentTimeMillis();
		int[] a = RandomTool.randomWithNoRepeat(0, 10000000, 10000000);
		long eTime = System.currentTimeMillis();
		long l = eTime - sTime;
		System.out.println(l);
		System.out.println(JTimeFormat.ms2hhmmssms(l));
		
//		for(int i :a)
//		System.out.println(i);
	}
}
