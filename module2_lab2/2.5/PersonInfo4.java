
public class PersonInfo2 {

	  String firstName;
	  String lastName;
	  //char gender;
	  enum Gender{
		  	M,F
	  }
	 Gender gender;

	 	PersonInfo2(String fn, String ln,Gender gdr)
	 	{
	 		firstName = fn;
	 		lastName = ln;
	 		gender = gdr;
	 	}


	 	public String getFirstName() {
	 		return firstName;
	 	}


	 	public void setFirstName(String firstName) {
	 		this.firstName = firstName;
	 	}


	 	public String getLastName() {
	 		return lastName;
	 	}


	 	public void setLastName(String lastName) {
	 		this.lastName = lastName;
	 	}


	 	public Gender getGender() {
	 		return gender;
	 	}


	 	public void setGender(Gender gender) {
	 		this.gender = gender;
	 	}
	 	public long contactNumber(long contact)
	 	{
	 		return contact;
	 	}

}