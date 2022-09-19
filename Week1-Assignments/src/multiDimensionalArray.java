
public class multiDimensionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] multArr = new int[5][5];
		for (int i = 0; i < multArr.length; i++) {
			for (int j = 0; j < multArr.length; j++) {
				multArr[i][j] = i*j;
				System.out.print(multArr[i][j]+",");
			}
			System.out.println();
		}
	}

}
