package Bank;

public class Testbank {
public static void main(String[] args) {
	Bank HSBC,Barclays,NBS;
	HSBC= new Bank();
	Barclays=new Bank();
	NBS=new Bank();
	Bank.Dollar=100;
	HSBC.Amount(2);
	Barclays.Amount(3);
	NBS.setdollar(200);
}
}