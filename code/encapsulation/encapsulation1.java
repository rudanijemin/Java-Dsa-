
public class encapsulation1 {

	public static void main(String[] args) {
		
		Secreat se = new Secreat();
		se.setdata(500);
		
		System.out.println(se.getdata());
	}
	
}

class Secreat
{
	private int a;
	
	void setdata(int a)
	{
		if(a>100)
		{
			this.a=a;;
		}
		else {
			System.out.println("plz enter value above 100");
		}
		
	}
	int getdata()
	{
		return  a;
	}
}
