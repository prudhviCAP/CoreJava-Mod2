package bankCaseStudy1;

public abstract class Account1 {

		private static long accNum=0;
		private double balance;
		private static Person1 accHolder;
		
		
		abstract void withdraw(double withdrawMoney);
		
		public long getAccNum() 
		{
			return accNum;
		}
		public void setAccNum(long accNum)
		{
			Account1.accNum = accNum;
		}
		public static Person1 getAccHolder()
		{
			return accHolder;
		}
		public void setAccHolder(Person1 accHolder) 
		{
			Account1.accHolder = accHolder;
		}
		
		public void setBalance(double balance) 
		{
			//this.balance = balance;
			if(balance>=500)
				this.balance=balance;
			else
			System.out.println("Minimum balance must be 500");
		}
		public void deposit(double depositMoney)
		{
			balance += depositMoney;
			System.out.println(depositMoney+" INR has been successfully Deposited to "+accHolder.getName()+" Account");
			System.out.println("Updated Balance of "+accHolder.getName()+" account is "+balance);
		}
		
		public double getBalance()
		{
			
			return balance;
		}
		public Account1(double balance,Person1 accHolder)
		{
			super();
			Account1.accNum++;
			setBalance(balance);
			Account1.accHolder=accHolder;
		}
		
		@Override
		public String toString() {
			return "Account1 [accNum=" + accNum + ", balance=" + balance + ", accHolder=" + accHolder.getName() + "]";
		}
		
	}

