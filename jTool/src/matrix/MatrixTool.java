package matrix;

/**
 * @author jackey90 2013-4-24
 */
public class MatrixTool {

	/**
	 * create a zero matrix with row rows and column columns
	 * 创建一个row行column列的0矩阵
	 * @param row
	 * @param column
	 * @return
	 * 2013-4-24
	 */
	public static int[][] zeros(int row, int column) {
		int[][] zero = new int[row][column];
		for(int i = 0; i < row; i++){
			for(int j = 0; j < column; j++){
				zero[i][j] = 0;
			}
		}
		return zero;
	}
		
}
