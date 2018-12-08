package bankCaseStudy;

public class SavingsAccount extends Account{

	final long minBalance=500;
	
	 public SavingsAccount(double balance, Person accHolder) {
		super(balance, accHolder);
		}

	@Override
	public void withdraw(double withdrawMoney) {
		if((super.getBalance()-withdrawMoney)>minBalance)
			super.withdraw(withdrawMoney);
		else
			System.out.println(" enter lesser amount ");
	}
	 
	 
}
