/*30/6
toggle bit */
class toggle {

    static int togglebit(int n,int i)
    {
        int mask = 1<<i;
        return n^mask; 
    }
    
    public static void main(String[] args) {
        
        System.out.println(togglebit(8,2));
    }
}
