/*towe of hanoi */

public class tower{

    static void towerOfHanoi(int n,char from , char to,char aux){
        if(n==0) return;

        towerOfHanoi(n-1, from, aux, to);
        System.out.println("move= "+n+"from= "+from+"to= "+to);
        towerOfHanoi(n-1, aux, to,from);
    }
    public static void main(String[] args) {
        towerOfHanoi(3, 'A', 'C', 'B');
    }
    
}
