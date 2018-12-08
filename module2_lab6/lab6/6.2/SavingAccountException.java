package bankCaseStudy;

public class SavingAccountException extends Account{

		final double minBalance = 500;
		
		public SavingAccountException(double balance,Person accHolder) {
			super(balance, accHolder);
			
		}
		
		@Override
		public void withdraw(double withdrawAmount){
			
			double currentBalance = getBalance();
			
			if (getBalance() > minBalance) {
				currentBalance -= withdrawAmount;
				setBalance(currentBalance);
			}
			
			else {
				System.out.println("Nil Balance");
			}
				
		}
		
		public static void main(String args[]) {
			 
			Person smith = new Person("smith",22);
			Person kathy = new Person("kathy",22);
			
			SavingAccountException smithAcc = new SavingAccountException(2000,smith);
			SavingAccountException kathyAcc = new SavingAccountException(3000, kathy);
			
			smithAcc.deposit(2000);
			
			kathyAcc.withdraw(2000);
			
			System.out.println(smithAcc.getBalance());
			System.out.println(kathyAcc.getBalance());
			
			Person kat = new Person("kathy",12);
			kat.getAge();
			kat.exHandler();
		}

	}

	
