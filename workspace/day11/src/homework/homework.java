package homework;
/*
 * 3.	如何遍历如下的二维数组
 * int[] arr = new int[][]{{1,2,3},{4,5},{6,7,8}};
 * 
 * 
 */

public class homework{
	public static void main(String[] args) {
		
		int[][] arr = new int[][]{{1,2,3},{4,5},{6,7,8}};
		for(int i = 0;i < arr.length;i++){
			for(int j = 0;j < arr[i].length;j++){
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
	}
}
