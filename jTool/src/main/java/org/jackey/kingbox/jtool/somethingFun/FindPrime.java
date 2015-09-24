package org.jackey.kingbox.jtool.somethingFun;

import java.awt.List;
import java.util.LinkedList;

/**
 * @author jackey90 2013-4-27
 */
public class FindPrime {

	/**
	 * find the prime within max, with optimizing
	 * @param max
	 * @return
	 * 2013-4-27
	 */
	public static int[] findThePrimeOptimize1(int max) {
		int[] result = new int[max / 2];
		int index = 1;

		result[0] = 2;
		boolean[] boolArray = new boolean[max];
		for (int i = 2; i < boolArray.length; i += 2) {
			boolArray[i] = true;
		}

		for (int j = 3; j < max; j += 2) {
			if (boolArray[j - 1]) {
				result[index++] = j;
				for (int m = j + j; m < max; m += j)
					boolArray[m - 1] = false;
			}
		}

		return result;
	}

	/**
	 * find the prime within max, with optimizing
	 * 
	 * @param max
	 * @return
	 * 2013-4-27
	 */
	public static LinkedList findThePrimeOptimize(int max) {
		LinkedList list = new LinkedList();
		list.add(2);
		boolean[] boolArray = new boolean[max];
		for (int i = 2; i < boolArray.length; i += 2) {
			boolArray[i] = true;
		}

		for (int j = 3; j < max; j += 2) {
			if (boolArray[j - 1]) {
				for (int m = j + j; m < max; m += j)
					boolArray[m - 1] = false;
			}
		}

		for (int m = 3; m < boolArray.length; m += 2) {
			if (boolArray[m - 1]) {
				list.add(m);
			}
		}

		return list;
	}

	/**
	 * find the primes within max, without optimizing
	 * @param max
	 * @return
	 * 2013-4-27
	 */
	public static LinkedList findThePrime(int max) {
		LinkedList list = new LinkedList();
		int[] result = new int[max / 2];
		int index = 0;
		for (int i = 2; i < max; i++) {
			if (isPrime(i)) {
				list.add(i);
				result[index++] = i;
			}
		}
		return list;
	}

	/**
	 *  whether n is a prime
	 * @param n
	 * @return
	 * 2013-4-27
	 */
	public static boolean isPrime(int n) {
		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}
}
