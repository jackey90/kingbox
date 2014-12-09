package org.jackey.kingbox.jtool.test.somethingFun;

import com.jackey.dateAndTime.time.JTimeFormat;
import com.jackey.inAndOut.JOutPrint;
import com.jackey.somethingFun.FindPrime;

public class TestFindPrime {
	public static void main(String[] args) {
		
		Long start = System.currentTimeMillis();
		//JOutPrint.JPrint(FindPrime.findThePrimeOptimize1(10));
		//JOutPrint.JPrint(FindPrime.findThePrime(100));
		//FindPrime.findThePrimeOptimize(100000000);
		FindPrime.findThePrimeOptimize(100000000);
		Long end = System.currentTimeMillis();

		JOutPrint.JPrint(JTimeFormat.ms2hhmmssms(end - start));
		
		
	}
}
