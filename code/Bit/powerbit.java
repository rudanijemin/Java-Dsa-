/*30/6
power bit == ex=1,2,,4,8,16,32,64....... */

class powerbit{
    static boolean isPower(int n){
        int res = n&(n-1);
        return res == 0;
    }
    public static void main(String[] args) {
        System.out.println(isPower(16));
    }
}