import exception.NameException;

public class PersonMain 
{
	public static void main(String[] args) 
	{
		
		Person person = new Person();
		
		System.out.println("Person Detail :  ");
		
			person.setFirstName(null);
			person.setLastName(null);
			person.setGender('M');
			try {
				if(person.getFirstName()==null && person.getLastName()==null)
					throw new NameException("Invalid Name");
				else
				{
			System.out.println("First Name : "+person.getFirstName()+"\nLast Name : "+person.getLastName()+
			"\nGender : "+person.getGender()+"\n");
		
				}
		}catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
