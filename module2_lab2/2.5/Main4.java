public class Main2 {
	public static void main(String[] args) {
		PersonInfo2 obj = new PersonInfo2("subham","agarwal",PersonInfo2.Gender.M);

 		System.out.println("FirstName: "+obj.getFirstName());
 		System.out.println("Secondname: "+obj.getLastName());
 		System.out.println("Gender: "+obj.getGender());
 		
 		Scanner in = new Scanner(System.in);
 		long contact;
 		
 		System.out.println("enter contact number: ");
 		contact =in.nextLong();
 		System.out.println("Contact number is: "+obj.contactNumber(contact));
	}
}

 
