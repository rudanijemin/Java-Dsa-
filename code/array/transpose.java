


public class transpose {

    static void printMatrix(int a[][]){
        int n=a.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }

    static void transposeMatrix(int a[][]){
        int n=a.length;
        for(int i=0;i<n;i++){
            for(int j=+1;j<n;j++){
                int swap = a[i][j];
                a[i][j]=a[j][i];
                a[j][i]=swap;
            }
            
        }
    }
    
    public static void main(String[] args) {
        int a[][]= {{3,5,6},
                    {6,8,2},
                    {9,6,2}
                };
                printMatrix(a);
                transposeMatrix(a);
                printMatrix(a);
    
        }
}
