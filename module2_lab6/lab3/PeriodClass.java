import java.sql.Date;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class PeriodClass {

		public static void main(String[] args) {
			
			DateTimeFormatter formatterDate = DateTimeFormatter.ofPattern("yyyy-MM-dd");
			Scanner sc = new Scanner(System.in);
			System.out.println("enter date in yyyy-MM-dd format: ");
			String input1 = sc.nextLine();
			LocalDate enteredDate= LocalDate.parse(input1,formatterDate);
			
			//System.out.println("enter date in yyyy-MM-dd format: ");
			//String input2 = sc.nextLine();
			//Date date1 = new SimpleDateFormat("yyyy-MM-dd").parse(input1);
			//LocalDate date1 = LocalDate.parse(input1);
			System.out.println("user given date is: "+enteredDate);
			
			LocalDate date2 = LocalDate.now();
			Period diff = enteredDate.until(date2);
			System.out.println("difference in dates is : "+diff.getYears()+" years "+diff.getMonths()+" months "+diff.getDays()+" days");
			sc.close(); 
		}
}
