package org.jackey.kingbox.jtool.inAndOut;

import java.util.List;

/**
 * @author jackey90 2013-4-24
 */
public class JOutPrint {

	private static final int constSize = 10;

	/**
	 * @param s
	 *            2013-4-24
	 */
	public static void JPrint(String s) {
		System.out.println(s);
	}

	/**
	 * print the array, every row contains size numbers
	 * 
	 * @param array
	 * @param size
	 *            every row contains size numbers 2013-4-24
	 */
	public static void JPrint(int[] array, int size) {
		for (int i = 0; i < array.length; i++) {
			if (i % size == 0) {
				System.out.println();
			}
			System.out.print(array[i] + "\t");
		}
		System.out.println();
	}

	/**
	 * print the array, every row contains 9 numbers
	 * 
	 * @param array
	 *            2013-4-24
	 */
	public static void JPrint(int[] array) {
		JPrint(array, constSize);
	}

	/**
	 * @param l
	 * @param size
	 *            2013-4-24
	 */
	public static void JPrint(List l, int size) {
		for (int i = 0; i < l.size(); i++) {
			if (i % size == 0) {
				System.out.println();
			}
			System.out.print(l.get(i) + "\t");
		}
	}

	/**
	 * @param l
	 *            2013-4-24
	 */
	public static void JPrint(List l) {
		JPrint(l, constSize);
	}

	/**
	 * 
	 * 2013-4-27
	 */
	public static void JPrint() {
		System.out.println();
	}

	/**
	 * @param n
	 *            2013-5-3
	 */
	public static void JPrint(int n) {
		System.out.println(n + "");
	}

	/**
	 * @param n
	 *            2013-5-3
	 */
	public static void JPrint(double n) {
		System.out.println(n + "");
	}
}
