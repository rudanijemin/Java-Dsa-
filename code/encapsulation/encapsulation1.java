/* 6/6/2022
 encapsulation = achieve data hiding 
*/
class encapsulation{
    public static void main(String[] args) {
        bankaccount ba = new bankaccount();
        ba.amount = 4;

        System.out.println(ba.amount);

    
    }

}

class bankaccount {

    int otp;
    int amount;

}
