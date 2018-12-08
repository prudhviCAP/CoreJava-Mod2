package bankCaseStudy1;

public class AccountMain1 extends Account1{
	
	public AccountMain1(double balance, Person1 accHolder) {
		super(balance, accHolder);
		// TODO Auto-generated constructor stub
	}

	void withdraw(double withdrawMoney)
	{
		if((getBalance()-withdrawMoney)>=500) {
		setBalance(getBalance() - withdrawMoney);
		System.out.println(withdrawMoney+" INR has been successfully Withdrawn from "+getAccHolder().getName()+" Account");
		System.out.println("Updated Balance of "+getAccHolder().getName()+" account is "+getBalance());
		}
		else {
			System.out.println("Money can't be withdrawn");
			System.out.println("Insufficient Fund / Minimum Balance Should be Rs. 500");
		}
	}
	
	
	
	
	public static void main(String[] args)
	{
		Person1 person1 = new Person1("Smith", 21);
		AccountMain1 account1 = new AccountMain1(2450, person1);
		System.out.println("Available Balance in the account of "+getAccHolder().getName()+" account is :"+account1.getBalance());
		account1.withdraw(2000);
		System.out.println(account1);
		
		Person1 person2 = new Person1("kathy", 21);
		AccountMain1 account2 = new AccountMain1(500000, person2);
		System.out.println("Available Balance in the account of "+getAccHolder().getName()+" account is :"+account2.getBalance());
		account2.withdraw(50001);
		System.out.println(account2);
		
	}

}
