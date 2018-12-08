import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class PeriodClass2
{

		public static void main(String[] args)
		{
			DateTimeFormatter formatterDate = DateTimeFormatter.ofPattern("yyyy-MM-dd");
			Scanner sc = new Scanner(System.in);
			System.out.println("enter date in yyyy-MM-dd format: ");
			String input1 = sc.nextLine();
			LocalDate enteredDate1= LocalDate.parse(input1,formatterDate);
			
			System.out.println("user given date1 is: "+enteredDate1);
			System.out.println("enter date2 in yyyy-MM-dd : ");
			String input2 = sc.nextLine();
			LocalDate enteredDate2= LocalDate.parse(input2,formatterDate);
			System.out.println("user given date2 is: "+enteredDate2);
			
			Period dif = enteredDate1.until(enteredDate2);
			System.out.println("differnce in two dates is : "+dif.getYears()+" years "+dif.getMonths()+" Months "+dif.getDays()+ " days");
			sc.close();
		}
}
