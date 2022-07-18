/*Given a sorted array with no duplicates A and a target value B, return the index if the
target is found. If not, return the index where it would be if it were inserted in order
{2,4,6,8,9,16}
key=7
ans=3 3 is a index number.*/
 
class insert{
 

static int find_index(int[] arr, int n, int K)
{
     
    
    int start = 0;
    int end = n - 1;
 
    // Traverse the search space
    while (start <= end)
    {
        int mid = (start + end) / 2;
 
        if (arr[mid] == K)
            return mid;
 
        else if (arr[mid] < K)
            start = mid + 1;
 
        else
            end = mid - 1;
    }
 
    return end + 1;
}
 
public static void main(String[] args)
{
    int[] arr = { 1, 3, 5, 6 };
    int n = arr.length;
    int K = 4;
     
    System.out.println(find_index(arr, n, K));
}
}