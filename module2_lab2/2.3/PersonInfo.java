import java.util.Scanner;
public class PersonInfo {

  String firstName;
  String lastName;
  char gender;
 

 	PersonInfo(String fn, String ln,char gdr)
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


 	public char getGender() {
 		return gender;
 	}


 	public void setGender(char gender) {
 		this.gender = gender;
 	}
 	
 
}