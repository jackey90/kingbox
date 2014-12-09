package org.jackey.kingbox.jtool.test.array;

import com.jackey.array.RepeatCheckPositiveInteger;

/**
 * @author jackey90
 * 2013-4-24
 */
public class TestRepeatCheckPositiveInteger {
	
	public static void main(String[] args) {
		
		int[] a = {2,3,4,5,6,7,8};
		int[] b = {234,34534,6745,234,456,678,4,2};
		
		if(RepeatCheckPositiveInteger.oneDimContinueArrayCheck(a,2)){
			System.out.println("oneDimContinueArrayCheck pass!");
		}
		
		if(RepeatCheckPositiveInteger.oneDimArrayCheck(b,34534)){
			System.out.println("RepeatCheckPositiveInteger pass!");
		}
		
		
		
	}
}
