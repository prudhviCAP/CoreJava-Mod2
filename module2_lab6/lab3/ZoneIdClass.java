import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Scanner;

public class ZoneIdClass
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.println("enter zoneId : ");
		String input = in.nextLine();
		System.out.println("entered zoneId is : "+input);
		
		ZonedDateTime zonedTime1=ZonedDateTime.now(ZoneId.of(input));
		System.out.println("time at give zone is : "+zonedTime1);
	}
}
