/*rat in a maze problem
Question = is there a path for rat */

public class rat {
        static boolean retInMaze(int a[][],boolean vis[][],int i,int j){
            int n = a.length;

            //base condition
            if(i>=n || j>=n || a[i][j]==0 || vis[i][j]){
                return false;
            }

            //base condition for successfully reached
            if(i==n-1 && j==n-1) return true;

            //mark this cell as visited
            vis[i][j]=true;

            // check if a path is possible from down
            if(retInMaze(a,vis,i+1,j)) return true;

            // check if a path is possible from right
            if(retInMaze(a,vis,i,j+1)) return true;

            
		    // Mark this cell as unvisited & Backtrack
		    vis[i][j] = false;
		
		    // backtrack
		    return false;
        }

    public static void main(String[] args) {

        int a[][]={
                {1, 1, 0, 1},
				{1, 1, 1, 1},
				{0, 0, 1, 0},
				{1, 1, 1, 1}
        };

        boolean vis[][] = new boolean[a.length][a.length];

        boolean isPathPossible = retInMaze(a, vis, 0, 0);
		
		System.out.println(isPathPossible);

        for(boolean [] array: vis) {
			for(boolean e: array) {
				System.out.print(e+" ");
			}
			System.out.println();
		}
        
    }
    
}
