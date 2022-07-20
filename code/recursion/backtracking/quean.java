/*N - Quean problem
1 row 1 quean
1 colum 1 quean
diaglon no quean */

public class quean {
    static boolean isSafe(int a[][], int n, int row, int col) {

        //cheak for colum (0,0) (1,0) (2,0) (3,0)......
		for(int i = 0; i < n; i++) {
			if(a[i][col] == 1) return false;
		}
		//cheak for left upper daiglon 
		for(int i = row, j = col; i>=0 && j >=0; i--, j--) {
			if(a[i][j] == 1) return false;
		}
		//chek for right upper daiglon
		for(int i = row, j = col; i>=0 && j < n; i--, j++) {
			if(a[i][j] == 1) return false;
		}
		
		return true;
	}
	
	public static boolean nQueen(int a[][], int n, int row) {
		
		if(row == n) return true;
		
		for(int col = 0; col < n; col++) {
			if(isSafe(a, n, row, col)) {
				a[row][col] = 1;
				if(nQueen(a, n, row+1)) {
					return true;
				}
				a[row][col] = 0;
			}
		}
		return false;
	}
    public static void main(String[] args) {
        int n = 5;
		int a[][] = new int[n][n];
		
		nQueen(a, n, 0);
		
		for(int[] array: a) {
			for(int e: array) {
				System.out.print(e+" ");
			}
			System.out.println();
		}
    }
}
