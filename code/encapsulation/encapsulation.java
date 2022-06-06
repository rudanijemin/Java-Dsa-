
/* 6/6/2022
 encapsulation = achieve data hiding 
*/
class encapsulation{
    public static void main(String[] args) {
        Bankaccount ba = new Bankaccount();
     //   ba.amount = 4;
        ba.setdata(1515,4000);

        System.out.println(ba.getdata());

    
    }

}

class Bankaccount {

    int otp=1234;
    private int amount;
    
    void setdata(int otp , int amount)
    {
    	if(otp==this.otp)
    	{
    		this.amount = amount;
    	}
    	else {
    		System.out.println("otp is not match");
    	}
    }
    int getdata()
    {
    	return amount;
    }

}
