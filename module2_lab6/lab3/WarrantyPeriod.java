import java.sql.Date;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class WarrantyPeriod {

		public static void main(String[] args) {
			DateTimeFormatter formatterDate = DateTimeFormatter.ofPattern("yyyy-MM-dd");
			Scanner sc = new Scanner(System.in);
			System.out.println("enter date in yyyy-MM-dd format: ");
			String input = sc.nextLine();
			System.out.println("given date is: "+input);
			LocalDate enteredDate1= LocalDate.parse(input,formatterDate);
			System.out.println("enter months before expiry");
			int expire = sc.nextInt();
			System.out.println(" warranty period is "+expire +" months ");
			
			LocalDate left = enteredDate1.plusMonths(expire);
			System.out.println("months and year of expiry is "+left.getMonth()+" of "+left.getYear());

		}
		
}
