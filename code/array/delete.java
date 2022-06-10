
class delete {
	public static int delete(int a[],inr key)
	{
		int n = a.length;
		for(int i=0;i<n;i++)
		{
			if(key==a[i])
			{
				break;
			}
		}
		if(i==n)return n;
		
		for(int j=i;j<n-1;j++)
		{
			a[j]=a[j+1];
		}
		return n-1;
		
	public static void main(String[] args) {
		int a[]= {3,65,8,9,35,78};
		int key = 8;
		delete(a,key);		
		for(int e:a) {
			System.out.println(e+" ");
		}
	}
}
