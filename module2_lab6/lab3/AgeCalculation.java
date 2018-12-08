package AgeNameMethod;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class AgeCalculation {
	
		private String firstName;
		private String lastName;
		private char gender;
		
		public AgeCalculation() {
			super();
			// TODO Auto-generated constructor stub
		}
		public AgeCalculation(String firstName, String lastName, char gender) {
			super();
			this.firstName = firstName;
			this.lastName = lastName;
			this.gender = gender;
			
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
		public String toString()
		{
			return "firstName=" + firstName + ", lastName=" + lastName
					+ ", gender=" + gender;
		}
		public void calcAge()
		{
			System.out.println("Enter your date of birth in the format yyyy-MM-dd :");
			Scanner sc=new Scanner(System.in);
			DateTimeFormatter formatter=DateTimeFormatter.ofPattern("yyyy-MM-dd");
			String input=sc.nextLine();
			LocalDate dob=LocalDate.parse(input, formatter);
			System.out.println("Entered date is :"+input);
			
			LocalDate localDate=LocalDate.now();
			Period diff=dob.until(localDate);
			System.out.println("Your age is "+diff.getYears()+" years "+diff.getMonths()+" months "+diff.getDays()+" days ");
			sc.close();
		}
		public void getFullName(String firstName, String lastName) 
		{
			StringBuilder sb = new StringBuilder(14); sb.append(firstName).append(" ").append(getLastName());
			System.out.println(sb.toString());

		}
		
	}

