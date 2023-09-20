package basics;

public class multiDimensionalArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] points = new int[4][2];
		points[0][0] = 1;
		points[0][1] = 1;
		points[1][0] = 2;
		points[1][1] = 2;
		points[2][0] = 3;
		points[2][1] = 3;
		points[3][0] = 4;
		points[3][1] = 4;
		for(int i=0; i<points.length; i++) {
			for(int j=0; j<points[i].length; j++) {
				System.out.print(points[i][j]);
			}
			System.out.print("\n");
		}
	}

}
