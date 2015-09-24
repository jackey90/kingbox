package org.jackey.kingbox.jtool.test.dataAndTime;

import org.jackey.kingbox.jtool.dateAndTime.time.JTimeFormat;

public class TestJTimeFormat {
	public static void main(String[] args) {
		int a = 1000;
		System.out.println(JTimeFormat.ss2hhmmss(a));
	}
}
