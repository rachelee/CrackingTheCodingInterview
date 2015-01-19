package chap01;


public class setToZero {
	public static void set(int[][] matrix, int width, int length)
	{
		boolean[] row = new boolean[width];
		boolean[] column = new boolean[length];
		for(int i = 0; i < width; i++)
			for(int j = 0; j < length; j++)
			{
				if (matrix[i][j] == 0)
				{
					row[i] = true;
					column[j] = true;
				}
			}
		
		for(int a = 0; a < width; a++)
			if(row[a] == true)
				for (int b = 0; b < length; b++)
					matrix[a][b] = 0;
		
		for (int a = 0; a < length; a++)
			if(column[a] == true)
				for (int b = 0; b < width; b++)
					matrix[b][a] = 0;

	}
	public static void main(String[] args) {
		int[][] matrix= {{1,2,3,4,5},{1,2,3,4,5},{1,0,3,4,5},{1,2,3,4,5},{1,2,3,4,5}};
		set(matrix, 5,5);
		System.out.println(matrix);
		//System.out.println(Arrays.deepToString(matrix));
	}

}
