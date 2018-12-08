public class Person
{
	private String FirstName;
	private String LastName;
	private char Gender;

	
	public enum Gen{M,F};
	Gen gender;
	
	
	public Person() 
	{
		this.FirstName="Aditya";
		this.LastName="Narayan";
		this.Gender='M';
		//super();
	}
	

	public Person(String firstName, String lastName, char gender)
	{
		this.FirstName="Aditya";
		this.LastName="Narayan";
		this.Gender='M';
		//super();
	}
	

	public String getFirstName()
	{
		return FirstName;
	}

	public void setFirstName(String firstName)
	{
		FirstName = firstName;
	}
	
	public String getLastName()
	{
		return LastName;
	}
	
	public void setLastName(String lastName)
	{
		LastName = lastName;
	}
	
	public char getGender()
	{
		return Gender;
	}
	
	public void setGender(char gender)
	{
		Gender = gender;
	}
	
	public long PhoneNo(long phoneNo)
	{
		return phoneNo;
	}
} 
 
