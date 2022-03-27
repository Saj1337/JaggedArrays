public class JaggedArray {

	public static void main(String[] args) {
		
		int[][] myArray = { {1}, {2,3}, {4,5,6}, {7,8,9,10}, {11,12,13,14,15}, {16,17,18,19,20,21} };
		
		for (int i = 0; i < myArray.length; i++) {
		    for (int j = 0; j < myArray[i].length; j++) {
		        System.out.print(myArray[i][j] + " ");
		    }
		}

	}

}