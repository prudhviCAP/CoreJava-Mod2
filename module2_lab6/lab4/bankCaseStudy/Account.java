package bankCaseStudy;
public class Account {
	private long accNum;
	private double balance;
	private Person accHolder;

	public long getAccNum() {
		//long x = (long) Math.random();
		return accNum;
	}

	public void setAccNum(long accNum) {
		this.accNum = accNum;
		//accNum =(long) (Math.random()*((100000-1000)+1)+1000);
	}

	public Person getAccHolder() {
		return accHolder;
	}

	public void setAccHolder(Person accHolder) {
		this.accHolder = accHolder;
	}

	public void setBalance(double balance) {
		this.balance = balance;
		if(balance>=500)
			balance = balance;
		else
			System.out.println("minimum balance must be 500");
	}
	
	public void deposit(double depositMoney) {
		balance += depositMoney;
		System.out.println("Money successfully deposited");
	}
	
	public void withdraw(double withdrawMoney) {
		balance -= withdrawMoney;
		System.out.println("hey "+accHolder.getName()+" : Money has been withdrawn from your account");
	}
	
	public double getBalance() {
		double showBalance = balance;
		System.out.print(accHolder.getName()+" account balance is ");
		return showBalance;
	}
	
	public Account(double balance,Person accHolder)
	{
		super();
		accNum = accNum++;
		this.balance = balance;
		this.accHolder = accHolder;
	}

	@Override
	public String toString() {
		return "Account [accNum=" + accNum + ", balance=" + balance + ", accHolder=" + accHolder + "]";
	}
	
	
	
}
