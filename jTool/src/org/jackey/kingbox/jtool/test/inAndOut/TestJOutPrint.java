package org.jackey.kingbox.jtool.test.inAndOut;

import java.util.ArrayList;
import java.util.List;

import com.jackey.inAndOut.JOutPrint;

public class TestJOutPrint {
	public static void main(String[] args) {
		int[] array = {234,34,5,23,42,34,34,1,1,2,545,56,67};
		JOutPrint.JPrint(array,2);
		
		List list = new ArrayList();
		for(int i = 0; i < 100; i++){
			list.add(i);
		}
		JOutPrint.JPrint(list);
	}
}
