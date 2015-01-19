package chap01;
import java.util.Arrays;


public class picRotate {
	public static void rotate(int[][] matrix, int length)
	{
		int temp;
		int indexMax = length-1;
		for (int layer = 0; layer < length/2; layer++)
		{	int first = layer;
			int last = length - 1 - layer;
			for (int j = first; j < last; j++)
			{
				temp = matrix[layer][j];
				matrix[layer][j] = matrix[indexMax-j][layer];
				matrix[indexMax-j][layer] = matrix[indexMax-layer][indexMax-j];
				matrix[indexMax-layer][indexMax-j] = matrix[j][indexMax-layer];
				matrix[j][indexMax-layer] = temp;
				
			}
		}
	}
	public static void main(String[] args) {
		int[][] matrix = {
				{1,2,3,4},
				{1,2,3,4},
				{1,2,3,4},
				{1,2,3,4}
		};
		System.out.println(Arrays.deepToString(matrix));
		rotate(matrix, 4);
		System.out.println(Arrays.deepToString(matrix));
			

	}

}
