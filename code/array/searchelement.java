

class searchelement {

	public static void main(String[] args) {
		int a[]= {3,4,22,7,9};
		int key = 9;
		int result = -1;
		for(int i=0;i<a.length;i++)
		{
			if(key==a[i])
			{
				result = i;
			}
		}
		if(result == -1)
		{
			System.out.println("element is not found");
		}
		else
		{
			System.out.println("element is index is "+result);
		}
	}

}




