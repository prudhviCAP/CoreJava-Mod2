package bankCaseStudy;

public class AccountMain {
	public static void main(String[] args) {
		Person person = new Person("smith",21);
		Account acc = new Account(2000,person);
		acc.deposit(2000);
		//acc.getBalance();
		System.out.println(acc.getBalance());
		
		Person person1 = new Person("kathy",21);
		Account acc1 = new Account(3000,person1);
		acc1.withdraw(2000);
		System.out.println(acc1.getBalance());
		//System.out.println(acc1.);
	}
}