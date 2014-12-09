package org.jackey.kingbox.jtool.dateAndTime.time;

/**
 * @author jackey90 2013-4-24
 */
public class JTimeFormat {

	/**
	 * convert ms to HH:mm:ss
	 * 
	 * @param l
	 * @return 2013-4-24
	 */
	public static String ms2hhmmss(long l) {
		String time = "";
		long seconds = l / 1000;
		long hour = seconds / 3600;
		seconds = seconds % 3600;
		long minutes = seconds / 60;
		seconds = seconds % 60;

		time = String.format("%0$,02d", hour) + " : "
				+ String.format("%0$,02d", minutes) + " : "
				+ String.format("%0$,02d", seconds);

		return time;
	}

	/**
	 * convert ms to HH:mm:ss
	 * 
	 * @param i
	 * @return 2013-4-24
	 */
	public static String ms2hhmmss(int i) {
		return ms2hhmmss(i);
	}

	/**
	 * convert ms to HH : mm : ss , ms
	 * 
	 * @param l
	 * @return 2013-4-24
	 */
	public static String ms2hhmmssms(long l) {
		String time = "";
		long seconds = l / 1000;
		long ms = l % 1000;
		long hour = seconds / 3600;
		seconds = seconds % 3600;
		long minutes = seconds / 60;
		seconds = seconds % 60;

		time = String.format("%0$,02d", hour) + " : "
				+ String.format("%0$,02d", minutes) + " : "
				+ String.format("%0$,02d", seconds) + " , "
				+ String.format("%0$,03d", ms);

		return time;
	}

	/**
	 * @param i
	 * @return 2013-4-24
	 */
	public static String ms2hhmmssms(int i) {
		return ms2hhmmssms(i);
	}

	/**
	 * @param seconds
	 *            long
	 * @return 2013-4-24
	 */
	public static String ss2hhmmss(long seconds) {
		String time = "";
		long hour = seconds / 3600;
		seconds = seconds % 3600;
		long minutes = seconds / 60;
		seconds = seconds % 60;

		time = String.format("%0$,02d", hour) + " : "
				+ String.format("%0$,02d", minutes) + " : "
				+ String.format("%0$,02d", seconds);

		return time;
	}

	/**
	 * @param seconds
	 *            int
	 * @return 2013-4-24
	 */
//	public static String ss2hhmmss(int seconds) {
//		return ss2hhmmss((long)seconds);
//	}
}